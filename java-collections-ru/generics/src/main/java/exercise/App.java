package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

//
class App {


    public static List<Map<String, String>> findWhere(List<Map<String, String>> list, Map<String, String> mapToCompare) {
        List<Map<String, String>> newList = new ArrayList<>();
        Massiv massiv = new Massiv();
        massiv.mapper = mapToCompare;
        for (Map<String, String> map : list) {
            if (massiv.filterMap(map)) {
                newList.add(map);
            }
        }
        return newList;
    }

}

class Massiv<T, R extends String> {
    public Map<T, R> mapper;


    public boolean filterMap(Map<T, R> mapForCompare) {
        Map<T, R> newMap = new HashMap<>(this.mapper.size());

        for (Map.Entry<T, R> entry : mapForCompare.entrySet()) {
            if (this.mapper.containsKey(entry.getKey())) {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap.equals(this.mapper);
    }
}
//END
