package set;
/*
* �ɱ��������jdk1.5֮����ֵ�������
*�������Ĳ����б����������Ѿ�ȷ�������ǲ����ĸ�����ȷ�����Ϳ���ʹ�ÿɱ�
* ���� */
public class ChangeArgs{
    public static void main(String[] args) {
        int i = add(10, 20, 10, 40, 70, 90);
        System.out.println(i);
    }

    public static int add(int ...arr){
//        System.out.println(arr);
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
