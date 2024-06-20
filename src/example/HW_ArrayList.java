package example;

import java.util.ArrayList;
import java.util.HashSet;

public class HW_ArrayList {

    public static void main(String[] args) {

        HashSet<String> listName = getEmployes();
        for(String name : listName){
            System.out.println(name);
        }
    }
    private static HashSet<String> getEmployes() {
        HashSet<String> listName = new HashSet<>();
        listName.add("Jone");
        listName.add("Jack");
        listName.add("Bella");
        listName.add("Edward");
        listName.add("Fox");
        return listName;
    }
}
