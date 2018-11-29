package amazon.demotest;

import java.util.List;

public class EightHousesCompetesMain {
    public static void main(String[] x) {
        System.out.println("EightHousesCompetesMain");
        EightHousesCompetesSolution solution = new EightHousesCompetesSolution();

        int[] input = new int[]{1, 0, 0, 0, 0, 1, 0, 0};
        List<Integer> response = solution.cellCompete(input, 1);

        System.out.println(response);

    }
}
