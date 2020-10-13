
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {
    
    int boxesVolume;
    public Packer(int boxesVolume){
        this.boxesVolume= boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> blist = new ArrayList<Box>();
        
        for(Thing t:things){
            Box b = new Box(this.boxesVolume);
            if(b.addThing(t)==true){
                blist.add(b);
            }
            
        }
        return blist;
    }
    
}
