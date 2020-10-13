//@MoFo

package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box{
    
    public List<Thing> list;
    
    public BlackHoleBox(){
        this.list = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
       list.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(list.contains(thing)){
            return false;
        }
        return false;
    }
    
    
    
}
