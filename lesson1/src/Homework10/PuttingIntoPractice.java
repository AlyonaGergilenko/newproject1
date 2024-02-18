package Homework10;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.min;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;


public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        //    1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей
//к большей).

        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(tr2011);

//       2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(cities);
        Set<String> collect = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println(collect);
//        3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                        .collect(Collectors.toList());
        System.out.println(traders);

//
//        4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном
//        порядке.
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining());
        System.out.println(traderStr);
//        5. Выяснить, существует ли хоть один трейдер из Милана.
        boolean milanBased = transactions.stream()
                        .anyMatch(transaction -> "Milan".equals(transaction.getTrader()
                                .getCity()));
        System.out.println(milanBased);

//        6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

//        7. Какова максимальная сумма среди всех транзакций?

        Optional <Integer> highestValue =
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);
        System.out.println(highestValue);
////        8. Найти транзакцию с минимальной суммой.

        Optional<Transaction> smallestTransaction = transactions.stream().min(comparing(Transaction::getValue));
        System.out.println(smallestTransaction);


    }


}
