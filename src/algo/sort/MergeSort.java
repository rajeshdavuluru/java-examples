package algo.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] x) {

        System.out.println("MergeSort");

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        MergeSort obj = new MergeSort();

        obj.recursiveSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(val -> {
            System.out.println(val);
        });
    }

    private void recursiveSort(int[] arr, int start, int end) {

        if (start < end) {

            int middle = (end + start) / 2;
            recursiveSort(arr, start, middle);
            recursiveSort(arr, middle + 1, end);

            merging(arr, start, middle, end);
        }
    }

    private void merging(int[] arr, int start, int middle, int end) {
        int arr1Length = middle - start + 1, arr2Length = end - middle;

        int[] arr1 = new int[arr1Length];
        int[] arr2 = new int[arr2Length];

        for (int i = 0; i < arr1Length; i++)
            arr1[i] = arr[start + i];

        for (int i = 0; i < arr2Length; i++)
            arr2[i] = arr[middle + 1 + i];

        int i = 0, j = 0;
        int k = start;
        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] > arr2[j]) {
                arr[k] = arr2[j];
                j++;
            } else {
                arr[k] = arr1[i];
                i++;
            }
            k++;
        }

        while (i < arr1Length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2Length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }
}
