package core.collection;

import java.util.ArrayList;
import java.util.List;

public class ListErasure {
    public static void main(String[] x){
        System.out.println("ListErasure");
        List list = new ArrayList();
        list.add(1);
        list.add("test");

        System.out.println(list);

        List<Object> list1 = new ArrayList();
        list1.add(0, "test");
        list1.add(1, 1);

        System.out.println(list1);
    }
}
