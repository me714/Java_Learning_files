package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ArrayList
public class DemoList {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.add(3, "itheima");
        System.out.println(list);
        String removeE= list.remove(2);
        System.out.println("被移除的元素：" + removeE);
        System.out.println(list);
        String setE = list.set(3, "A");
        System.out.println("被替换的元素：" + setE);
        System.out.println(list);
//        普通for循环
        for(int i=0; i<list.size(); i++){
            String s = list.get(i);
            System.out.println(s);

        }
        System.out.println("-------------");
//        使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------");
//        使用增强for
        for (String s: list){
            System.out.println(s);
        }

    }
}
