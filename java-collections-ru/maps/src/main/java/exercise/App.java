package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {

        String[] massOfWords = sentence.toLowerCase().split(" ");
        Map<String, Integer> result = new HashMap<>(massOfWords.length);
        for (String word: massOfWords) {
            if (sentence.isEmpty()){
                return new HashMap<>(0);
            }
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }
        return result;

    }
    public static String toString(Map<String, Integer> map ) {

        if (map.isEmpty()) {
            return "{}";
        }
        String result = " {\n  ";

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            result += entry.getKey() + ": " + entry.getValue() +"\n  ";
        }
        result = result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
}
//END
