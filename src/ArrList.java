import java.util.ArrayList;
import java.util.List;

public class ArrList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();      //declaring arraylist

        list.add("jeden");
        list.add("dwa");
        list.add("trzy");
        list.add("jeden");
        list.add("jeden");
        list.add("cztery");

        System.out.println("czy lista jest pusta? " + list.isEmpty());     //spr czy lista jest pusta; -> false
        System.out.println(list);

        list.remove("jeden");       //usuwa pierwsze wystąpienie danego elementu

        System.out.println("pobieranie z indeksu nr1: " + list.get(1));        // pobieranie z danego indeksu

        System.out.println("contains?");
        System.out.println(list.contains("dwa"));       // true
        System.out.println(list.contains("zero"));      // false

        for (String name : list) {      // foreach
            System.out.println(name);
        }

        list.clear();                       // wyczyszczenie listy
        System.out.println(list.isEmpty());     //true

    }
}
