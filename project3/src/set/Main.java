package set;

public class Main {
    public static void main(String[] args) {
        BinarySearchTreeToSet<Integer> a = new BinarySearchTreeToSet<>();
        for (int i = 0; i < 19; i++) {
            a.add(i);

        }
        System.out.println(a);
    }

}
