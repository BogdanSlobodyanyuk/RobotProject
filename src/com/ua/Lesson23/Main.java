package src.com.ua.Lesson23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(findOutNumbersOfRepeatOfEverySureName());
        System.out.println(CountSumOfListNumbers());
    }

    public static Map findOutNumbersOfRepeatOfEverySureName() {
        List<String> sureNameBase = List.of("Danilov", "Sloboda", "Casimir", "Nestorov", "Ararat");

        List<String> sureNames = new ArrayList<>();

        Map<String, Integer> sureNameCounted;

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            sureNames.add(sureNameBase.get(random.nextInt(0, 5)));
        }

        sureNameCounted = sureNames.stream()
                .collect(Collectors.toMap(surname -> surname, surname -> 1, Integer::sum));


        return sureNameCounted;
    }


    public static int CountSumOfListNumbers() {
        List<Integer> numbers = new ArrayList<>();

        Random random = new Random();

        int sumOfNumbers = 0;

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(0, 10));
        }

        sumOfNumbers = numbers.stream().mapToInt(Integer::intValue).sum();

        return sumOfNumbers;
    }
}
