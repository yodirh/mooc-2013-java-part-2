
package application;
import java.util.concurrent.ThreadLocalRandom;

public class Thermometer implements Sensor{
    
    private boolean check =false;
    
    public Thermometer(){
        
    }

    @Override
    public boolean isOn() {
         if(this.check==true){
             return true;
         }
         return false;
    }

    @Override
    public void on() {
        this.check = true;
    }

    @Override
    public void off() {
        this.check= false;
    }

    @Override
    public int measure() {
        if (isOn()== true){
            int rand = ThreadLocalRandom.current().nextInt(-30, 30);
        return rand;
        }
        else{
            throw new IllegalStateException();
        }
    }
    
    
    
}
