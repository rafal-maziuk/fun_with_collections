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

        System.out.println(list.isEmpty());     //spr czy lista jest pusta; -> false
        System.out.println(list);

        list.remove("jeden");       //usuwa pierwsze wystąpienie danego elementu

        for (String name : list) {      // foreach
            System.out.println(name);
        }

        list.clear();                       // wyczyszczenie listy
        System.out.println(list.isEmpty());     //true

    }
}
