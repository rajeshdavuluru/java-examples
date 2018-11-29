package algo.search;

public class JumpSearch {
    public static void main(String[] x) {
        System.out.println("JumpSearch");
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int value = 55;

        int step = (int) Math.ceil(Math.sqrt(arr.length));

        int prev = 0;
        while (step < arr.length) {
            //System.out.println(step);
            if (arr[step] > value)
                return;

            prev = step;
            step += prev;
        }

        // System.out.println(step);
        //System.out.println(prev);

        for (int i = prev; i < step - 1; i++) {
            if (arr[i] == value) {
                System.out.println("Element " + value + " found at index " + i);
            }
        }
    }
}
