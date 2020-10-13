
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RingingCentre {
    
   private Map<Bird, List<String>> list = new HashMap<Bird, List<String>>();
    
    public void observe(Bird bird, String place){
        if(!list.containsKey(bird)){
            list.put(bird, new ArrayList<String>());
        }
        list.get(bird).add(place);
        
    }
    
    public void observations(Bird bird){
        
        if(!list.containsKey(bird)){
            System.out.println(bird.getlatinname()+ " ("+ bird.getringingYear()+") observations: 0");
        }
        else{
            System.out.println(bird.getlatinname()+ " ("+ bird.getringingYear()+") observations: "+ list.get(bird).size());
                for(String s: list.get(bird)){
                    System.out.println(s);
                }
        }
    }
    
}
