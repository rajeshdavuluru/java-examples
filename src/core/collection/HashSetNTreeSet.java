package core.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetNTreeSet {
    public static void main(String[] x) {
        System.out.println("HashSetNTreeSet");

        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(1);
        hashSet.add(9);
        hashSet.add(21);
        hashSet.add(null);

        System.out.println(hashSet);

        TreeSet treeset = new TreeSet();
        treeset.add(10);
        treeset.add(1);
        treeset.add(9);
        treeset.add(21);
        // treeset.add(null);  //null not allowed here, gives null pointer exception

        System.out.println(treeset);


    }
}
