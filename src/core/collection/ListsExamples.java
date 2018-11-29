package core.collection;

import java.util.*;

/**
 * ArrayList, Vector and LinkedList
 */
public class ListsExamples {

    public static void main(String[] x){
        System.out.println("ListsExamples");

        //initial capacity =10 , Asynchronised,
        ArrayList arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(9);
        arrayList.add(12);
        arrayList.add(1);
        System.out.println(arrayList);

        Iterator ir = arrayList.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }

        Iterator ir1 = arrayList.listIterator();
        while(ir1.hasNext()){
            if(((ListIterator) ir1).hasPrevious()){
                System.out.print("Previous "+((ListIterator) ir1).previousIndex()+"-::-");
            }

            System.out.println(ir1.next());
        }

        Iterator ir3 = arrayList.listIterator(2);
        while(ir3.hasNext()){
            System.out.println(ir3.next());
        }

        // Initial capacity  = 10, Synchronised,
        Vector vector = new Vector();
        vector.add(10);
        vector.add(1);
        vector.add(9);
        vector.add(12);
        vector.add(1);
        System.out.println(vector);

        //Doubly linked list,
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(12);
        linkedList.add(1);
        System.out.println(linkedList);

    }
}
