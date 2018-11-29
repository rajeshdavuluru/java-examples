package core.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapNHashTable {
    public static void main(String[] x){
        System.out.println("HashMapNHashTable");

        Map map = new HashMap();
        map.put(null, "value1");
        map.put("Key1", null);
        map.put(null, null);

        System.out.println(map);

        Hashtable hashtable = new Hashtable();
        hashtable.put("Key1", "Value2");
        hashtable.put("Key1", "Value3");
        //hashtable.put(null, "Valie2");
        //hashtable.put("Key1", null);
        System.out.println(hashtable);
    }
}
