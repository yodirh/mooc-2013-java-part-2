
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive{
    
    private String name;
    private Barn barn;
    private List<Cow> list;
    public Farm(String name, Barn barn){
        this.name=name;
        this.barn=barn;
        this.list= new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.name;
    }
    
    public void addCow(Cow cow){
        list.add(cow);
    }
    
    public String getCows(){
        if(list.isEmpty()){
            return "No cows.";
        }
 
        String ret = "Animals:";
        for (Cow cow : list) {
            ret += "\n        " + cow;
        }
        return ret;
    }
    
    public void manageCows(){
        barn.takeCareOf(list);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }
    
    public void liveHour(){
        for (Cow c: list){
            c.liveHour();
        }
    }
    
    public String toString(){
        return "Farm owner: "+ getOwner()+"\n"
                +"Barn bulk tank: "+ barn.toString()+"\n"
                +getCows();
    }
    
    
}
