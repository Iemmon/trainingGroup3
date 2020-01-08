package task5.t5_3dictionary.model;

import java.util.HashMap;
import java.util.Map;

public class DictionaryModel {
    private Map<String, String> dictionary = new HashMap<>();

    public boolean addWord(String word, String translation) {
        dictionary.put(word, translation);
        return false;
    }

    public String translate(String[] phrase) {
        StringBuilder sb = new StringBuilder();
        for (String word : phrase){
            sb.append("\\s").append(dictionary.get(word.trim()));
        }

        return sb.toString();
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }
}
