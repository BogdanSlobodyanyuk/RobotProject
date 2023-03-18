package src.com.ua.lesson18.repository;

import java.util.*;

public class NumbersCollections {

    private static final byte SIZE_OF_SMALL_NUMBERS_COLLECTION = 10;

    private static final int SIZE_OF_BIG_NUMBERS_COLLECTION = 2000000;

    public static List<Integer> smallCollection = new ArrayList<>();
    public static List<Integer> bigCollection = new LinkedList<>();

    public NumbersCollections() {
    }

    public static void fillNumbersInSmallCollection() {
        for (int i = 0; i < SIZE_OF_SMALL_NUMBERS_COLLECTION; i++) {
                Integer num = getRandomNumber();
                smallCollection.add(i, num);
        }
    }

    public static void fillNumbersInBigCollection() {
        for (int i = 0; i < SIZE_OF_BIG_NUMBERS_COLLECTION; i++) {

                Integer num = getRandomNumber();
                bigCollection.add(i, num);
        }
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(1, 3);
    }


}
