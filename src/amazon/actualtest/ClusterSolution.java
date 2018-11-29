package amazon.actualtest;

import java.util.ArrayList;
import java.util.List;

public class ClusterSolution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> optimalUtilization(
            int deviceCapacity,
            List<List<Integer>> foregroundAppList,
            List<List<Integer>> backgroundAppList) {
        System.out.println("Inside ClusterSolution");
        // WRITE YOUR CODE HERE
        List<Integer> foregroundApp = new ArrayList<>();
        List<Integer> backgroundApp = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        int max = 0;
        List<Integer> subList = new ArrayList<>();
        for (int i = 0; i < foregroundAppList.size(); i++) {
            for (int j = 0; j < backgroundAppList.size(); j++) {
                foregroundApp = foregroundAppList.get(i);
                backgroundApp = backgroundAppList.get(j);


                if (foregroundApp.get(1) + backgroundApp.get(1) <= deviceCapacity
                        && foregroundApp.get(1) + backgroundApp.get(1) >= max) {
                    subList = new ArrayList<>();
                    if (foregroundApp.get(1) + backgroundApp.get(1) > max) {

                        finalList = new ArrayList<>();
                    }

                    max = foregroundApp.get(1) + backgroundApp.get(1);
                    subList.add(foregroundApp.get(0));
                    subList.add(backgroundApp.get(0));
                    //subList.add(max);
                    finalList.add(subList);
                }


            }
        }
        return finalList;
    }
    // METHOD SIGNATURE ENDS

}
