package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("ddd", "ddfd");
        map.put("d2d", "ddfd");
        map.put("d3d", "ddfd");
        map.put("dd", "ddfd");
        Set<Map.Entry<Object, Object>> set = map.entrySet();
        Iterator<Map.Entry<Object, Object>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Object,Object> entry = it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+ "="+value);


        }
    }
}
