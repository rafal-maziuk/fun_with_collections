import java.util.*;

public class HMap {

    public static void main(String[] args) {
        // HashMap, key - value structure

        Map<String, String> map = new HashMap<>();

        map.put("Leo", "Football");     // to add we use PUT command
        map.put("Xavi", "Football");
        map.put("Many", "Box");
        map.put("Fiodor", "MMA");
        map.put("Adam", "Ski Jumping");
        map.put("Alessandro", "Football");

        System.out.println(map.get("Many"));

        map.put("Many" , "Football");
        System.out.println(map.get("Many"));    // second value replaced first !

        System.out.println("-----key----");
        Set<String> mapKeySet = map.keySet();       // showing all key values
        for (String key : mapKeySet) {
            System.out.println(key);
        }
        System.out.println("---------");

        System.out.println("/////value//////");
        Collection<String> valuesOfMap = map.values();       // iterating at values, using COLLECTION
        for (String val : valuesOfMap) {
            System.out.println(val);
        }
        System.out.println("///////////");

        System.out.println(map.containsKey("Xavi"));
        System.out.println(map.containsValue("F1"));

        System.out.println(map.isEmpty());      // false
        map.clear();
        System.out.println(map.isEmpty());      // true
        System.out.println(map.get("Many"));    // null

    }
}
