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
        System.out.println("���Ƴ���Ԫ�أ�" + removeE);
        System.out.println(list);
        String setE = list.set(3, "A");
        System.out.println("���滻��Ԫ�أ�" + setE);
        System.out.println(list);
//        ��ͨforѭ��
        for(int i=0; i<list.size(); i++){
            String s = list.get(i);
            System.out.println(s);

        }
        System.out.println("-------------");
//        ʹ�õ�����
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------");
//        ʹ����ǿfor
        for (String s: list){
            System.out.println(s);
        }

    }
}
