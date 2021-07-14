package Map;

import java.util.HashMap;
import java.util.Scanner;

/*1.ʹ��Scanner��ȡ�û�������ַ���
* 2.����Map���ϣ�key��*/
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
