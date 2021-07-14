package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoCollections2 {
    public static void main(String[] args) {

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);
        list01.add(4);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 -o2;
                return o2 -o1;
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("µÏÀöÈÈ°Í",18));
        list02.add(new Student("¹ÅÁ¦ÄÈÔú",20));
        list02.add(new Student("ÑîÃİ",17));
        list02.add(new Student("ÑîÃİ",18));
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge()-o2.getAge();
                if(result==0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);

                }
                return result;
            }
        });
        System.out.println(list02);

    }
}
