package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Setdemo4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("www");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("itcast");
        linked.add("abc");
        linked.add("abc");

        System.out.println(linked);

    }
}
