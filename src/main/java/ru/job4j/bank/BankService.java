package ru.job4j.bank;

import java.util.*;

/**
 * Модель системы банковских переводов.
 * @author СК.
 * @version 1.0
 */

public class BankService {
    /**
     * Хранение данных осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить пользователя в систему
     * @param user - вновь вводимый в систему пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> acList = users.get(user.get());
            if (!acList.contains(account)) {
                acList.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя в системе по его паспортным данным
     * @param passport паспортные данные искомого пользователя
     * @return метод возвращат искомого пользователя при наличии, либо
     * Optional обёртку на null при отсутствии
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод осуществляет поиск счёта в системе по паспортным данным пользователя и реквизитам счёта
     * @param passport паспортные данные пользователя
     * @param requisite реквизиты счёта
     * @return метод возвращат искомый счёт пользователя при наличии, либо
     * Optional обёртку на null при отсутствии
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод осуществяет перевод заданного объёма денежных средств с одного счёта на другой, возможны переводы как
     * в рамках счётов одного пользователя, так и переводы от одного пользователя на счёт другого
     * @param srcPassport паспортные данные пользователя, осуществляеющего перевод
     * @param srcRequisite реквизиты счёта пользователя, осуществляющего перевод
     * @param destPassport паспортные данные пользователя, получающего перевод
     * @param destRequisite реквизиты счёта пользователя, получающего перевод
     * @param amount количество переводимых средств
     * @return статус выполнения операции: true - перевод выполнен, false - перевод не выполнен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

