package array;

import java.util.Arrays;

public class Array<E> {
    private E[] data;
    private int size;

//构造方法，传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }
//    无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addLast(E e){
        if (size==getCapacity()){
            throw new IllegalArgumentException("AddLast failed.Array is full");
        }
        data[size] = e;
        size++;
    }

    public void addFirst(E e){
        add(0,e);
    }


    public void add(int index,E e){
        if (size==data.length){
            throw new IllegalArgumentException("AddLast failed.Array is full");}
        if (index<0|| index>size){
            throw new IllegalArgumentException("Add failed. Require index >= 0");}
        for (int i = size; i >= index ; i--) {
            data[i + 1] = data[i];
            data[index] = e;
            size++;
        }
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size - 1){
                res.append(", ");
            }

        }
        res.append(']');
        return res.toString();
    }

    E get(int index){
        if (index < 0 || index>= size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        return data[index];
    }

    void set(int index, E e){
        if (index < 0 || index>= size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        data[index] = e;
    }

    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    public int find(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return i;
            }

        }
        return -1;
    }
    public void remove(int index){
        if (index < 0 || index>= size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        for (int i = index; i <= size; i++) {
            data[i] = data[i+1];
        }
        size--;
    }
    public String removeFirst(){
        remove(0);
        return "删除成功~~~";
    }
    public String removeLast(){
        remove(size-1);
        return "删除成功~~~";
    }

    public String  removeElement(E e){
        int index = find(e);
        if (index != -1){
            remove(index);
            return "删除成功";

        }
        return "没有这样的元素";
    }


}
