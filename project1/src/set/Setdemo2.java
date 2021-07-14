package set;

import java.util.HashSet;

public class Setdemo2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add("s1");
        set.add("s2");
        set.add("zhondi");
        set.add("tonghua");
        set.add("abc");
        System.out.println(set);

    }
}
