
package moving.domain;

import java.util.ArrayList;

public class Box implements Thing{
    
    private int maximumCapacity;
    private ArrayList<Thing> list;
    public Box (int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.list = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){ 
        int diff = this.maximumCapacity - getVolume();
        if(thing.getVolume()<=diff){
            list.add(thing);
            return true;
        }
        return false;
    }
    
    @Override
    public int getVolume(){
        int i = 0;
        for (Thing t: list){
            i = i +t.getVolume();
        }
        return i;
    }
    
    
}
