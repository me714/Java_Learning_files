package demo;
/*
* 匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象*/
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("=============");
        new Person().name = "赵又廷";
        new Person().showName();



    }
}
