package demo;
/*
* ��������ֻ��ʹ��Ψһ��һ�Σ��´����ò��ò��ٴ���һ���¶���*/
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "��ԲԲ";
        one.showName();
        System.out.println("=============");
        new Person().name = "����͢";
        new Person().showName();



    }
}
