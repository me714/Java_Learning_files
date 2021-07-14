package demo;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        one.room ="101教室";
        System.out.println("姓名："+ one.getName()+"年龄："+one.getAge()
                +"教师："+one.room+"学号："+one.getId());
        Student two = new Student("黄蓉", 18);
        System.out.println("姓名："+ two.getName()+"年龄："+two.getAge()
                +"教师："+one.room+"学号："+two.getId());

    }
}
