
package farmsimulator;

public class MilkingRobot {
    
    private BulkTank Tank;
    public MilkingRobot(){
        
    }
    
    public BulkTank getBulkTank(){
        return Tank;
    }
    
    public void setBulkTank(BulkTank tank){
        Tank = tank;
    }
    
    public void milk(Milkable milkable){
        if(getBulkTank() == null){
            throw new IllegalStateException(); 
        }else{
            Tank .addToTank(milkable.milk());
        }
        
    }
    
    
}
