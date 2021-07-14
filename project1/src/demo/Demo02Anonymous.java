package demo;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();


        int num1 = new Scanner(System.in).nextInt();
        System.out.println(num1);
        methodParam(new Scanner(System.in));
    }
    public static void methodParam(Scanner sc){
        int num2 = sc.nextInt();
        System.out.println(" ‰»Îµƒ «£∫"+num2);

    }
}
