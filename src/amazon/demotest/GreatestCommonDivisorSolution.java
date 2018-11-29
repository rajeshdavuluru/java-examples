package amazon.demotest;

import java.util.Arrays;

public class GreatestCommonDivisorSolution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr) {

        Arrays.sort(arr);

        int gcdValue = 1;
        boolean flag = true;

        for (int i = 1; i <= arr[0]; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    flag = false;
                    break;
                }

            }
            if (flag)
                gcdValue = i;
        }

        return gcdValue;
        // WRITE YOUR CODE HERE
    }
    // METHOD SIGNATURE ENDS

}
