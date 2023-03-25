package src.com.ua.lesson20.service;

import src.com.ua.lesson20.repository.SaveWords;
import java.util.Arrays;
import java.util.Scanner;

public class UserService {

    SaveWords savedWord = new SaveWords();

    public String makeTranslation(String word) {

        String result = savedWord.getTranslationFromUkrainianIntoThreeLanguage().get(word);
        if (result == null) {
            result = "I don't know this word ";
        }

        return result;
    }

    public void startTranslator() {
        System.out.println("I know some words, so you can translate them from Ukrainian into three different languages");
        System.out.println("I know : " + Arrays.toString(savedWord.getUkrainianOriginalWords()));
        System.out.println("Please enter your word: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your translation: " + makeTranslation(scanner.nextLine()));

    }
}
