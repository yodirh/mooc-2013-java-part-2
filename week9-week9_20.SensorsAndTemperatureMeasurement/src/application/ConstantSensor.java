
package application;

public class ConstantSensor implements Sensor{
     
    private int parameter ;
    
    public ConstantSensor(int parameter){
        this.parameter = parameter;
    }
    
    @Override
    public boolean isOn(){
        return true;
    }
    
    @Override
    public void on(){
        
    }
    
    @Override
    public void off(){
        
    }
    
    @Override
    public int measure(){
        return this.parameter;
    }
}
