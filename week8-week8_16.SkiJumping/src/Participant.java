//@MoFo

import java.util.ArrayList;
import java.util.HashMap;


public class Participant implements Comparable<Participant>{
    
    String name;
    int point;
    HashMap<String, Integer> list;
    ArrayList<Participant> alist;
    
    public Participant(String name, int point){
        this.name = name;
        this.point = point;
        this.alist = new ArrayList<Participant>();
        this.list = new HashMap<String, Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoint(){
        return this.point;
    }
    
    @Override
    public String toString(){
        return getName() + ":" + getPoint();
    }
    
    @Override
    public int compareTo(Participant participant){
        return getPoint() - participant.getPoint();
    }
    
}
