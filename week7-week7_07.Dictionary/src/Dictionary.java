//@MoFo

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    
    private HashMap<String, String> map;
    
    public Dictionary(){
        this.map = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(this.map.containsKey(word)){
            return this.map.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        this.map.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.map.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for(String key: this.map.keySet()){
            String m = key + " = "+ this.map.get(key);
            list.add(m);
        }
        
        return list;
    }
}
