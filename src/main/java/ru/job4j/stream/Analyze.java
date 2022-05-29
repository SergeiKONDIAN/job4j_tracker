package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(pupil ->  pupil.getSubjects().stream())
                .mapToInt(Subject::getScore).average()
                .orElse(-1);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {

        return stream.map(pupil -> new Tuple(
                pupil.getName(),
                pupil.getSubjects().stream()
                        .mapToInt(Subject::getScore).average()
                        .orElse(-1)
                ))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(k -> new Tuple(k.getKey(), k.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        Optional<Tuple> tuple = stream.map(pupil -> new Tuple(
                        pupil.getName(),
                        pupil.getSubjects().stream()
                                .mapToInt(Subject::getScore).sum()
                ))
                .max(Tuple::compareTo);
        return tuple.orElseGet(() -> tuple.orElse(new Tuple("orElseTuple", -1)));
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        Optional<Tuple> tuple = stream.flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        LinkedHashMap::new,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(k -> new Tuple(k.getKey(), k.getValue()))
                .max(Tuple::compareTo);
        return tuple.orElseGet(() -> tuple.orElse(new Tuple("orElseTuple", -1)));
    }
}