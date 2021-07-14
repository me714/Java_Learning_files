package collections;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Collections.addAll(list, "a","b","c");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
