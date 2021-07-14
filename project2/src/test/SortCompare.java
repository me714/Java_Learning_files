package test;

import algorithm.sort.Insert;
import algorithm.sort.Shell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(SortCompare.class.getClassLoader().getResourceAsStream("reverse_arr.txt")));
        String line=null;
        while((line=reader.readLine())!=null){
            int i = Integer.parseInt(line);
            list.add(i);

        }
        reader.close();

        Integer[] a = new Integer[list.size()];
        list.toArray(a);
        testinsert(a);




    }
    public static void testshell(Integer[] a){
        long start = System.currentTimeMillis();
        Shell.sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void testinsert(Integer[] a){
        long start = System.currentTimeMillis();
        Insert.sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
