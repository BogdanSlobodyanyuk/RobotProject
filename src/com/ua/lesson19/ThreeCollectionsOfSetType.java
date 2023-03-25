package src.com.ua.lesson19;

import java.util.*;

public class ThreeCollectionsOfSetType {

    private final Set<Integer> hashSetCollection = new HashSet<>();
    private final Set<Integer> linkedHashSetCollection = new LinkedHashSet<>();
    private final Set<Integer> treeSetCollection = new TreeSet<>();

    private static final int QUANTITY_OF_NUMBERS = 1000;


    public ThreeCollectionsOfSetType() {
        addRandomNumbersToHashSet();
        addRandomNumbersToLinkedHashSet();
        addRandomNumbersToTreeSet();
    }

    public Set<Integer> getHashSetCollection() {
        return hashSetCollection;
    }

    public Set<Integer> getLinkedHashSetCollection() {
        return linkedHashSetCollection;
    }

    public Set<Integer> getTreeSetCollection() {
        return treeSetCollection;
    }

    public void addRandomNumbersToHashSet() {
        for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
            hashSetCollection.add(generateRandomNumber());
        }
    }

    public void addRandomNumbersToLinkedHashSet() {
        for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
            linkedHashSetCollection.add(generateRandomNumber());
        }
    }

    public void addRandomNumbersToTreeSet() {
        for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
            treeSetCollection.add(generateRandomNumber());
        }
    }

    private int generateRandomNumber() {
        Random random = new Random();

        return random.nextInt(1, 50);
    }


}
