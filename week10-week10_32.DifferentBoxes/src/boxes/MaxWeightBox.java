//@MoFo

package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxweight;

    private List<Thing> list = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxweight = maxWeight;
    }
    
    @Override
    public void add(Thing thing) {

        if (maxweight - addedThingsWeight() >= thing.getWeight()) {
            list.add(thing);

        }
    }

    public int addedThingsWeight() {
        int addedweight = 0;
        for (Thing t : list) {

            addedweight += t.getWeight();

        }
        return addedweight;
    }
    
    @Override
    public boolean isInTheBox(Thing thing) {
        if (list.contains(thing)) {
            return true;
        }
        return false;
    }
}
