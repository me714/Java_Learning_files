package stack;

public class StackToQueue implements Queue{
    ArrayStack<Integer> stack1;
    ArrayStack<Integer> stack2;
    int size;

    public StackToQueue(int capacity) {
        stack1 = new ArrayStack<>(capacity);
        stack2 = new ArrayStack<>(capacity);
        int size = 0;
    }

    public StackToQueue() {
        this(10);
    }

    @Override
    public int peek() {
        if (stack2.getSize()== stack2.getSize()){
            return stack2.peek();
        }else{
            for (int i = 0; i < stack1.getSize(); i++) {
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        }

    }

    @Override
    public int pop() {
        if (stack2.getSize()== stack2.getSize()){
            return stack2.pop();
        }else{
            for (int i = 0; i < stack1.getSize(); i++) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(int e) {
        stack1.push(e);
        size++;

    }
}
