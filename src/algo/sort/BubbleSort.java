package algo.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] x){
        System.out.println("BubbleSort");
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        for(int j=0; j< arr.length -1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(val -> {
            System.out.println(val);
        });
    }
}
