package core.collection;

import java.util.*;

public class MapsExample {
    public static void main(String[] x){
        System.out.println("MapsExample");

        String s= "test";
        System.out.println(0+s.charAt(0));
        System.out.println("Key1".hashCode());
        System.out.println("key1".hashCode());


        /**
         *
         */
        HashMap<String,String> hashMap =new HashMap<String,String>( );
        hashMap.put("key1","cherry");
        hashMap.put ("Key1","cherry1");
        hashMap.put ("key5", null);
        hashMap.put (null, "test");
       // hashMap.put (null, null);
        System.out.println(hashMap.get(null));
        System.out.println(hashMap);

        //initial capacity =11
        Hashtable<String,String> hashtable =new Hashtable<String,String>( );
        hashtable.put("key1","cherry");
        hashtable.put ("key2","banana");
        hashtable.put ("key3","apple");
        hashtable.put ("key4","kiwi");
        hashtable.put ("key1","cherry1");
       // hashtable.put ("key1",null);
        //hashtable.put (null,"test");
       // hashtable.put (null,null);
        System.out.println(hashtable);

        //initialcapacity=16
        LinkedHashMap<String,String> linkedHashMap =new LinkedHashMap<String,String>( );
        linkedHashMap.put("key1","cherry");
        linkedHashMap.put ("key2","banana");
        linkedHashMap.put ("key3","apple");
        linkedHashMap.put ("key4","kiwi");
        linkedHashMap.put ("key1","cherry1");
        //hashtable.put ("key1",null);
        //hashtable.put (null,"test");
         //hashtable.put (null,null);
        System.out.println(linkedHashMap);

        // Sort by Keys
        TreeMap treeMap = new TreeMap();
        treeMap.put("key1", "value1");
        treeMap.put("abc", "value1");
        //treeMap.put(null, "value2");
        System.out.println(treeMap);

        System.out.println(1<<4);
        System.out.println(1>>>4);
        System.out.println(1<<30);

    }
}
