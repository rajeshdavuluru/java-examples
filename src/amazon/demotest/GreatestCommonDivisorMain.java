package amazon.demotest;

public class GreatestCommonDivisorMain {
    public static void main(String[] x) {
        System.out.println("GreatestCommonDivisorMain");
        GreatestCommonDivisorSolution solution = new GreatestCommonDivisorSolution();

        int[] input = new int[]{2, 3, 4, 5, 6};
        int response = solution.generalizedGCD(5, input);

        System.out.println(response);

    }
}
