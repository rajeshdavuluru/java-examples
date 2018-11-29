package algo.search;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] x) {
        System.out.println("LinearSearch");
        int[] intarr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int n = 60;

        boolean found = Arrays.stream(intarr).filter(value -> value == n).findFirst().isPresent();
        System.out.println(found);

        boolean found1 = Arrays.stream(intarr).anyMatch(value -> value == n);
        System.out.println(found1);

        for (int i : intarr) {
            if (i == n) {
                System.out.println("Found");
            }
        }

    }
}
