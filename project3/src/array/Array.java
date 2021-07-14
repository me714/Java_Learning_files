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

        add(size,e);
        System.out.println(size);
        System.out.println(data.length);
    }

    public void addFirst(E e){
        add(0,e);
        System.out.println(size);
    }


    public void add(int index,E e){
        if (index<0|| index>size){
            throw new IllegalArgumentException("Add failed. Require index >= 0");}
        if (size==data.length){
            resize(2*data.length);
            System.out.println("dddf");
            }
        for (int i = size-1; i >= index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int i) {
        E[] newData = (E[]) new Object[i];
        for (int j = 0; j < size; j++) {
            newData[j] = data[j];
        }
        data = newData;
        
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

    public E get(int index){
        if (index < 0 || index>= size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        return data[index];
    }

    public E getLast(){
        return get(size-1);
    }

    public E getFirst(){
        return get(0);
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
    public E remove(int index){
        if (index < 0 || index>= size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        for (int i = index; i <= size; i++) {
            data[i] = data[i+1];
        }
        size--;
        if(size == data.length/2){
            resize(data.length/2);

        }
        return data[index];

    }
    public E removeFirst(){
        return remove(0);
    }
    public E removeLast(){
        return remove(size-1);

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
