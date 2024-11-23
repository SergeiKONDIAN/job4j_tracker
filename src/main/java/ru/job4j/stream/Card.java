package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    @Override
    public String toString() {
        return value + " " + suit;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(value -> Stream.of(Value.values())
                        .map(suit -> new Card(value, suit)))
                .forEach(System.out::println);
    }
}