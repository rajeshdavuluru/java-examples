package amazon.actualtest;

import java.util.ArrayList;
import java.util.List;

class AlexaMain {

    public static void main(String[] x) {
        System.out.println("AlexaMain");
        AlexaSolution solution = new AlexaSolution();

        List<List<Integer>> input = new ArrayList<List<Integer>>();

        List<List<Integer>> response = solution.nearestXsteakHouses(3, input, 2);

    }
}