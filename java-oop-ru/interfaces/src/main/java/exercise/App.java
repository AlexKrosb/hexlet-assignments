package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

    }
    public static List<String> buildApartmentsList(List<Home> accomodations, int n) {
        List<String> resultList = accomodations.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .limit(n)
                .map(Home::toString)
                .collect(Collectors.toList());
        return resultList;
    }
}
// END
