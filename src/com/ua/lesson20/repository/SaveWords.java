package src.com.ua.lesson20.repository;

import java.util.*;

public class SaveWords {

    private final String[] ukrainianOriginalWords = {"Кіт", "Машина", "Душа", "Криша", "Сонце", "Класний", "Хмари", "Вітер", "Літо", "Рибалка"}; //This Collection Of Words should upload from some file
    private final String[] englishTranslatedWords = {"Cat", "Car", "Soul", "Roof", "Sun", "Cool", "Clouds", "Wind", "Summer", "Fishing"};
    private final String[] germanTranslatedWords = {"Katze", "Auto", "Seele", "Dach", "Sonne", "Kühl", "Wolken", "Wind", "Sommer", "Fischen"};
    private final String[] japanTranslatedWords = {"猫", "車", " 魂", "屋根", "太陽", "涼", "雲", "風", "夏", "釣り"};

    private final Map<String, String> translationFromUkrainianIntoThreeLanguage = new HashMap<>();

    public SaveWords() {
        fillMapCollection();
    }

    public String[] getUkrainianOriginalWords() {
        return ukrainianOriginalWords;
    }

    public Map<String, String> getTranslationFromUkrainianIntoThreeLanguage() {
        return translationFromUkrainianIntoThreeLanguage;
    }


    public void fillMapCollection() {
        for (int i = 0; i < ukrainianOriginalWords.length; i++) {
            translationFromUkrainianIntoThreeLanguage.put(ukrainianOriginalWords[i], englishTranslatedWords[i] + " (English), "
                    + germanTranslatedWords[i] + " (German), "
                    + japanTranslatedWords[i] + " (Japan)");
        }
    }
}