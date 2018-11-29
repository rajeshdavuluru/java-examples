package amazon.actualtest;

import java.util.ArrayList;
import java.util.List;

public class ClusterMain {

    public static void main(String[] x) {
        System.out.println("ClusterMain");
        ClusterSolution solution = new ClusterSolution();

        List<List<Integer>> foreground = new ArrayList<List<Integer>>();
        List<List<Integer>> background = new ArrayList<List<Integer>>();

        List<List<Integer>> response = solution.optimalUtilization(20, foreground, background);

    }
}
