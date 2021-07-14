package Map;

import java.util.HashMap;
import java.util.Scanner;

/*1.使用Scanner获取用户输入的字符串
* 2.创建Map集合，key是*/
public class MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please put in a string");
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }

        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }


    }

}
