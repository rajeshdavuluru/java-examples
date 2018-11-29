package core.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsExamples {
    public static void main(String[] x){
        System.out.println("SetsExamples");

        /**
         * 1) Initial Capacity =16, Load Factor = .75. if you want you can change the these params
         * 2) Internally uses the HashMap, but Map required key value pairs, but we are setting only value
         *      internally HashSet creates a constant dummy object and put as a puts as a value
         *
         *      Code Snippet: private static final Object PRESENT = new Object();
         *       public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         * 3) No Guarantee the order of the iteration of elements over the time
         * 4) if we try to do operations except remove after iterator opened it will give ConcurrentModificationError
         * 5) how to calculate LoadFactor
         *          loadfactor = number of elements in the HashSet/ initial capacity of the hashset
         * 6) Its not synchronised
         * 7) No Duplicates allowed because value will be stored as a key in HashMap, HashMap wont allow duplicate keys
         * 8) Allows one null value
         */
        HashSet hashSet = new HashSet();

        hashSet.add(10);
        hashSet.add(1);
        hashSet.add(9);
        hashSet.add(21);
        hashSet.add(9);
        hashSet.add(null);

        System.out.println(hashSet);

        //it internally create the HashMap
        HashSet hashSet1 = new HashSet(100, .95f);

        //it internally create the HashMap
        // TODO:
        HashSet hashSet2 = new HashSet(5);
        System.out.println(hashSet2);

        hashSet2.add("1");
        hashSet2.add("2");
        hashSet2.add("3");
        hashSet2.add("3");

        //it internally create the LinkedHashMap
        //third parameter is dummy to distinguish other constructors
        //this is default access type we can not access outside of the package
        //HashSet hashSet3 = new HashSet(10, 0.75f, true);

        System.out.println("--------------------------------------------------------------");

        /**
         * 1) Initial Capacity & Load Factor is not required
         * 2) Internally uses the HashMap, but Map required key value pairs, but we are setting only value
         *      internally HashSet creates a constant dummy object and put as a puts as a value
         *
         *      Code Snippet: private static final Object PRESENT = new Object();
         *       public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         * 3) Elements will store in order
         * 4) if we try to do operations except remove after iterator opened it will give ConcurrentModificationException
         * 5) Its not synchronised
         * 6) No Duplicates allowed, because value will be stored as a key in HashMap, HashMap wont allow duplicate keys
         * 7) No Null values allowed
         * 8) wont use the HashCode and Equals, it uses compare &compareTO
         */

        TreeSet treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(21);
        treeSet.add(9);
       // treeSet.add(null);

        System.out.println(treeSet);

        System.out.println("--------------------------------------------------------------");


        /**
         * 1) Initial Capacity =16, Load Factor = .75. if you want you can change the these params
         * 2) Internally uses the Hash table & DoubleLinkedList, but Map required key value pairs, but we are setting only value
         *      internally HashSet creates a constant dummy object and put as a puts as a value
         *
         *      Code Snippet: private static final Object PRESENT = new Object();
         *       public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         * 3) Guarente the insertion order of the iteration of elements over the time
         * 4) if we try to do operations except remove after iterator opened it will give ConcurrentModificationError
         * 5) how to calculate LoadFactor
         *          loadfactor = number of elements in the HashSet/ initial capacity of the hashset
         * 6) Its not synchronised
         * 7) No Duplicates allowed because value will be stored as a key in HashMap, HashMap wont allow duplicate keys
         * 8) Allows one null value
         */
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(1);
        linkedHashSet.add(9);
        linkedHashSet.add(21);
        linkedHashSet.add(null);
        linkedHashSet.add(21);
        System.out.println(linkedHashSet);

    }
}
