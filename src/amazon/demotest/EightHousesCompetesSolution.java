package amazon.demotest;

import java.util.ArrayList;
import java.util.List;

public class EightHousesCompetesSolution {
    //List<Ineger> temp =new ArrayList<>();
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days) {
        List<Integer> list = new ArrayList<>();
        // WRITE YOUR CODE HERE
        int prev = 0, next = 0, actual = 0;
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < states.length; j++) {
                if (j == 0)
                    prev = 0;
                else prev = actual;

                if (j + 1 > states.length - 1)
                    next = 0;
                else next = states[j + 1];

                actual = states[j];

                if ((prev == 0 && next == 0) || (prev == 1 && next == 1))
                    states[j] = 0;
                else if ((prev == 0 && next == 1) || (prev == 1 && next == 0)
                        && states[j] == 0)
                    states[j] = 1;

                if (i + 1 == days)
                    list.add(states[j]);
            }

        }
        return list;
    }
    // METHOD SIGNATURE ENDS

}
