package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static void main(String[] args) {
    }

    public static boolean scrabble(String stroke, String word) {

        String strokeLowerCase = stroke.toLowerCase();
        String wordLowerCase = word.toLowerCase();

        int sizeOfStroke = stroke.length();
        int sizeOfWord = word.length();

        if (sizeOfStroke < sizeOfWord) {
            return false;
        }

        List<Character> listOfStroke = new ArrayList<>();
        char[] massForWord = wordLowerCase.toCharArray();

        for (char ch : strokeLowerCase.toCharArray()) {
            listOfStroke.add(ch);
        }

        for (char ch : massForWord) {
                if (listOfStroke.contains(ch)) {
                    listOfStroke.remove((Character) ch);
                    System.out.println(listOfStroke);
            }  else {
                    return false;
                }

        }
        return true;
    }
}
//END
