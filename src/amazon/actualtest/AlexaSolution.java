package amazon.actualtest;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class AlexaSolution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> nearestXsteakHouses(int totalSteakhouses,
                                            List<List<Integer>> allLocations,
                                            int numSteakhouses) {

        System.out.println("inside AlexaSolution");
        // WRITE YOUR CODE HERE
        List<List<Integer>> finalLocation = new ArrayList<>();

        Map<Integer, Integer> distance = new TreeMap<>();
        for (int j = 0; j < allLocations.size(); j++) {
            List<Integer> location = allLocations.get(j);
            int sum = 0;
            for (int val : location) {
                sum += val * val;
            }
            distance.put(sum, j);
        }

        for (Map.Entry<Integer, Integer> entry : distance.entrySet()) {
            if (finalLocation.size() < numSteakhouses) {
                finalLocation.add(allLocations.get(entry.getValue()));
            } else break;
        }

        return finalLocation;
    }
    // METHOD SIGNATURE ENDS
}
