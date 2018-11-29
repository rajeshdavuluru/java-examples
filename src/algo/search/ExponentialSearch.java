package algo.search;

public class ExponentialSearch {
    public static void main(String[] x) {
        System.out.println("ExponentialSearch");

        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int value = 21, max = 1, min = 0;
        if (arr[0] == value)
            return;
        while ( max < arr.length && arr[max] < value  ) {

            System.out.println();
            min = max;
            max *= 2;
        }
        binarySearch(min, Math.min(max, arr.length), arr, value);
    }

    public static void binarySearch(int min, int max, int[] arr, int value) {
        int mid = (min + max) / 2;

        if (arr[mid] == value)
            System.out.println("Element found at " + mid);
        else if (arr[mid] < value) {
            min = mid + 1;
            binarySearch(min, max, arr, value);
        } else {
            max = mid - 1;
            binarySearch(min, max, arr, value);
        }


    }
}
