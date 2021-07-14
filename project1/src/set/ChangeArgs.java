package set;
/*
* 可变参数：是jdk1.5之后出现的新特性
*当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变
* 参数 */
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
