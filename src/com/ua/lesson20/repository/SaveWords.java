package src.com.ua.lesson20.repository;

import java.util.*;

public class SaveWords {

    private final List<String> ukrainianOriginalWords = List.of("Кіт", "Машина", "Душа", "Криша", "Сонце", "Класний", "Хмари", "Вітер", "Літо", "Рибалка");
    private final List<String> englishTranslatedWords = List.of("Cat", "Car", "Soul", "Roof", "Sun", "Cool", "Clouds", "Wind", "Summer", "Fishing");
    private final List<String> germanTranslatedWords = List.of("Katze", "Auto", "Seele", "Dach", "Sonne", "Kühl", "Wolken", "Wind", "Sommer", "Fischen");
    private final List<String> japanTranslatedWords = List.of("猫", "車", " 魂", "屋根", "太陽", "涼", "雲", "風", "夏", "釣り");

    private final Map<String, String> translationFromUkrainianIntoThreeLanguage = new HashMap<>();

    public SaveWords() {
        fillMapCollection();
    }

    public List<String> getUkrainianOriginalWords() {
        return ukrainianOriginalWords;
    }

    public Map<String, String> getTranslationFromUkrainianIntoThreeLanguage() {
        return translationFromUkrainianIntoThreeLanguage;
    }


    public void fillMapCollection() {
        for (int i = 0; i < ukrainianOriginalWords.size(); i++) {
            translationFromUkrainianIntoThreeLanguage.put(ukrainianOriginalWords.get(i), englishTranslatedWords.get(i) + " (English), "
                    + germanTranslatedWords.get(i) + " (German), "
                    + japanTranslatedWords.get(i) + " (Japan)");
        }
    }
}