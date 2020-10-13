
package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{
    
    private List<Movable> group ;
    public Group(){
        this.group = new ArrayList<Movable>();
    }
    
    @Override
    public String toString(){
        String o = "";
        for(Movable m: this.group){
                o = o + m.toString()+"\n";
        }
        //return this.group.get(0;*/
        return o;
    }
    
    public void addToGroup(Movable movable){
        this.group.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for( Movable m: this.group){
            m.move(dx, dy);
        }
    }
    
}
