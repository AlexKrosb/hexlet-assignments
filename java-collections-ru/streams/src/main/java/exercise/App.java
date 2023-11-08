package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {

        long countList = emailsList.stream()
                .filter(string -> !string.isEmpty())
                .map(string -> string.substring(string.indexOf('@')))
                .filter(string -> string.contains("gmail.com")
                        || string.contains("yandex.ru")
                        || string.contains("hotmail.com"))
                .count();

        return countList;
    }
}
// END
