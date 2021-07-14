package array;

public class Main {
    public static void main(String[] args) {
        Array<Student> a = new Array<>(6);

        a.addFirst(new Student(1,"dfsdf"));

        a.add(1,new Student(2,"dfds"));
        a.add(2,new Student(3,"dfdfds"));
        a.addLast(new Student(3,"dfdfds"));
        Student b;
        a.addLast(b = new Student(4,"dfdfds"));
        a.addLast(new Student(5,"dfdfds"));
        a.addLast(new Student(6,"dfdfds"));
        a.addLast(new Student(7,"dfdfds"));
        a.addLast(new Student(8,"dfdfds"));
        a.addLast(new Student(9,"dfdfds"));
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        System.out.println(a.get(1));
        a.removeLast();
        System.out.println(a);
        System.out.println(a.removeElement(b));
    }
}
