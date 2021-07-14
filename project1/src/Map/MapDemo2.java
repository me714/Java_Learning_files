package Map;

import jdk.nashorn.api.tree.WhileLoopTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("zly", 168);
        map.put("ldh", 164);
        map.put("yy", 165);
        map.put("zzp", 190);
        Set<Object> set = map.keySet();
        for (Object o : set) {
            System.out.println(o);
            
        }
        Iterator<Object> c = set.iterator();
        while (c.hasNext()){
            Object ke = c.next();
            Object value = map.get(ke);
            System.out.println(ke+"=" + value);

        }
    }

}
