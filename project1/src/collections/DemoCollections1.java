package collections;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollections1 {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("a");
        list01.add("b");
        list01.add("c");
        list01.add("d");
        list01.add("e");
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        list02.add("e");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三", 18));
        list03.add(new Person("李四", 20));
        list03.add(new Person("王五", 15));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);

    }
}
