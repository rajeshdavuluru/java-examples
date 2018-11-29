package algo.search;

public class InterpolationSearch {

    public static void main(String[] x) {
        System.out.println("InterpolationSearch");

        int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int value = 47, low = 0, high = arr.length - 1;

        int pos = 0;

        boolean found = false;
        while (!found && pos <= arr.length - 1) {
            pos = low + (((high - low) * (value - arr[low]) / (arr[high] - arr[low])));
            if (arr[pos] == value) {
                System.out.println("Element Found @ position " + pos);
                found = true;
            } else if (arr[pos] > value) {
                high = pos - 1;
            } else if (arr[pos] < value) {
                low = pos + 1;
            }

        }

    }

}
