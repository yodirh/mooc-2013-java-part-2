
package farmsimulator;

public class BulkTank {
    
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000;
        volume = 0;   
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
        volume = 0;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double howMuchFreeSpace(){
        return capacity - volume;
    }
    
    public void addToTank(double amount){
        if(howMuchFreeSpace()>= amount){
            volume= volume+amount;
        }else{
            volume=capacity;
        }
    }
    
    public double getFromTank(double amount){
        if(amount>=volume){
            volume = 0;
           return volume;
        }
       return volume = volume - amount;
        
    }
    
    @Override
    public String toString(){
        return Math.ceil(getVolume()) +"/"+Math.ceil(getCapacity());
    }
    
}
