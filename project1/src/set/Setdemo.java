package set;

import java.util.HashSet;
import java.util.Iterator;

/*set�ӿڵ��ص�
1.���������ظ���Ԫ��
2.û��������û�д������ķ�����Ҳû����ͨ��ѭ������
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
