package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    public static void show01() {
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("Àî³¿", "·¶±ù±ù1");
        String v2 = map.put("Àî³¿", "·¶±ù±ù2");
        System.out.println("v1:" + v1);
        System.out.println("v2:" + v2);
        System.out.println(map);
        map.put("Àä·æ", "ÁúÐ¡ÔÆ");
        map.put("yangguo", "xiaolongnv");
        map.put("yingzhiping", "xiaolongnv");
        System.out.println(map);
    }
    public static void show02(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("zly",168);
        map.put("yy",165);
        map.put("lzl",178);
        System.out.println(map);

        Object v1 = map.remove("lzl");
        System.out.println("v1:"+v1);
        System.out.println(map);

        Object v2 = map.remove("la");
        System.out.println("v2:"+ v2);
        System.out.println(map);
    }
    public static void show03(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("zly",168);
        map.put("yy",165);
        map.put("lzl",178);
        Object v1 = map.get("yy");
        System.out.println("v1:"+v1);
        Object v2 = map.get("dlrb");
        System.out.println("v2:"+v2);
        Set<Object> v3 = map.keySet();
        for (Object o : v3) {
            System.out.println(o);
        }




    }

}
