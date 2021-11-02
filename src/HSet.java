import java.util.HashSet;
import java.util.Set;

public class HSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();      // set -> przechowuje unikalne wartości, bez duplikatów

        set.add("pizza");
        set.add("burger");
        set.add("burger");
        set.add("salad");
        set.add("pizza");
        set.add("pizza");
        set.add("pizza");

        for (String meal : set) {       // added everything without duplicated items, RANDOM order
            System.out.println(meal);
        }
    }
}
