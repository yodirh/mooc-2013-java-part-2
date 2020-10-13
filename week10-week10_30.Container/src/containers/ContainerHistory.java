
package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {
    
    private List<Double> list;
    public ContainerHistory(){
        this.list= new ArrayList<Double>();
    }
    
    public void add(double situation){
        list.add(situation);
    }
    
    public void reset(){
        list.removeAll(list);
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public double maxValue(){
        if(list.isEmpty()){
            return 0;
        }
        double i= 0;
        for (Double list1 : list) {
            if (list1>i){
                i = list1;
            }
        }
        return i;
    }
    public double minValue(){
        
        double i = maxValue();
        for(Double lst: list){
            if(lst<i){
                i=lst;
            }
        }
        return i;
    } 
    
    public double average(){
        double i= 0;
        for(Double d:list){
            i = i+d;
        }
        return i/list.size();
    }
    
    public double greatestFluctuation(){
        double i = 0;
        if(list.isEmpty()||list.size()==1){
            return 0;
        }
        else{
            
            for(int j=0; j<list.size()-1; j++){
                
                if(i<Math.abs(list.get(j)- list.get(j+1))){
                    i = Math.abs(list.get(j)- list.get(j+1));
                }
            }
        }
        return i;
    }
    
    public double variance(){
        double i=0;
        for(double d:list){
            i = i+ Math.pow(d-average(), 2);
        }
        return i/(list.size()-1);
    }
    
    
}
