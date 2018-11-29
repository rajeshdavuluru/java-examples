package algo.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] x) {
        System.out.println("SelectionSort");
        int arr[] = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        Arrays.stream(arr).forEach(val -> {
            System.out.println(val);
        });
    }
}
