package stack;

public class Main {
    public static void main(String[] args) {
//        LinkedListStack<Integer> stack = new LinkedListStack<>();
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
        StackToQueue queue = new StackToQueue(10);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        }
    }
