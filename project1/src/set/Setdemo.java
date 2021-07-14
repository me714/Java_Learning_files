package set;

import java.util.HashSet;
import java.util.Iterator;

/*set接口的特点
1.不允许储存重复的元素
2.没有索引，没有带索引的方法，也没有普通的循环遍历
*HashSet

*
*
* */
public class Setdemo {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        Iterator<Object> it = set.iterator();
        while (it.hasNext()){
            Object n = it.next();
            System.out.println(n);
        }
        System.out.println("-------------");
        for (Object i : set) {
            System.out.println(i);
        }
    }
}
