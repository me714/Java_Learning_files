package list;

import java.util.LinkedList;

//LinkedList����
/*LinkedList���ϵ��ص�
 * �ײ�������ṹ����ѯ������ɾ��
 * ������β����*/
public class Listdemo {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        LinkedList<Object> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        linked.add("e");
        System.out.println(linked);
        Object first = linked.getFirst();
        System.out.println(first);
        Object last = linked.getLast();
        System.out.println(last);
        linked.pop();
        System.out.println(last);
        linked.clear();

        System.out.println(linked);
    }

    private static void show01() {
        LinkedList<Object> linled = new LinkedList<>();
        linled.add("a");
        linled.add("b");
        linled.add("c");
        System.out.println(linled);
        linled.addFirst("wwww");
        System.out.println(linled);
        linled.push("wwww");
        System.out.println(linled);
        linled.addLast("wwww");
        System.out.println(linled);


    }

}