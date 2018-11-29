package core.misc;

import java.util.*;

public class ScannerTest {

    public static void main(String[] x){
        System.out.println("ScannerTest");

       // Scanner scanner = new Scanner(System.in);

       // String s1 = scanner.nextLine();
       // String s2 = scanner.nextLine();

        List list = new ArrayList();
        list.add(21);
        list.add(15);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //int[] test = Arrays.sort(list.toArray());
        //System.out.println(Arrays.sort(list.toArray()));
        /*System.out.println(list.sort((o1, o2) -> {

        }));*/


    }
}
