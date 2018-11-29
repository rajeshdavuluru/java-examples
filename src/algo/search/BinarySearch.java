package algo.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] x) {
        System.out.println("BinarySearch");
        int[] intarr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int n = 100;

        //{10, 20,  30,  50, 60, 80, 100, 110,  130, 170};
        Arrays.sort(intarr);

        boolean found = false;
        int min = 0, max = intarr.length, mid = (max / 2) + 1;
        System.out.println(mid);
        do {
            if (intarr[mid] == n) {
                System.out.println("Found" + intarr[mid]);
                found = true;
            } else if (intarr[mid] > n) {
                max = mid;
                mid = ((max - min) / 2);
                found = false;
                System.out.println("Not Found1");
            } else if (intarr[mid] < n) {
                min = mid;
                mid = ((max + min) / 2);
                found = false;
                System.out.println("Not Found2");
            }
        } while (!found);


    }
}
