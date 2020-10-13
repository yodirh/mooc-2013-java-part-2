//@MoFo

import java.util.ArrayList;

public class Container {

    private int maxweight;
    private int numsuitcase = 0;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int maxweight) {
        this.maxweight = maxweight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int i = totalContainerWeight() + suitcase.totalWeight();

        if (i <= maxweight) {
            suitcases.add(suitcase);
            numsuitcase++;
        }
    }

    public void printThings() {
        for (Suitcase s : suitcases) {
            s.printThings();
        }
    }

    public int totalContainerWeight() {
        int sum = 0;
        for (Suitcase s : suitcases) {
            sum = sum + s.totalWeight();
        }
        return sum;
    }

    public String toString() {
        return numsuitcase + " suitcases (" + totalContainerWeight() + " kg)";
    }

}
