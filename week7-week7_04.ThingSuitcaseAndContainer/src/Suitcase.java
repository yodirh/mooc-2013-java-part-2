//@MoFo

import java.util.ArrayList;

public class Suitcase {

    private int maxweight;
    private int numofthings = 0;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxweight) {
        this.maxweight = maxweight;

    }

    // add things in suitcase if maxweight is not exceed
    public void addThing(Thing thing) {

        int i = totalWeight() + thing.getWeight();

        if (i <= this.maxweight) {            
            things.add(thing);
            numofthings++;
        }
    }

    public void printThings() {
        for (Thing t : things) {
            System.out.println(t);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Thing t : things) {
            sum = sum + t.getWeight();
        }
        return sum;

    }

    public Thing heaviestThing() {
        int max = 0;
        Thing i = null;

        for (Thing t : things) {
            if (max < t.getWeight()) {
                max = t.getWeight();
                i = t;
            }
        }
        return i;
    }

    public String toString() {
        if (numofthings == 0) {
            return "empty (" + totalWeight() + " kg)";
        } else if (numofthings == 1) {
            return numofthings + " thing (" + totalWeight() + " kg)";
        }

        return numofthings + " things (" + totalWeight() + " kg)";
    }

}
