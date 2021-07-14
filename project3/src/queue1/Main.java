package queue1;

public class Main {
    public static void main(String[] args) {
        LoopQueue<Integer> q = new LoopQueue<>(23);
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
            System.out.println(q);
        }
    }
}
