package boxes;

import java.util.ArrayList;
//@MoFo

import java.util.List;

public class OneThingBox extends Box {

    private List<Thing> list;

    public OneThingBox() {
        this.list = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (this.list.isEmpty()) {
            this.list.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (list.contains(thing)) {  //use equal method
            return true;
        }
        return false;
    }
}
