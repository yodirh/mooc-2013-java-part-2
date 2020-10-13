//@MoFo

import java.util.ArrayList;

public class Changer {
    
    ArrayList<Change> changes = new ArrayList<Change>();
    
    public Changer(){
    
    }
    
    //add all changes to the arraylist
    public void addChange(Change change){
        changes.add(change);
    }
    
    //apply all changes in the list to the string
    public String change(String characterString){
        for(Change ch : changes){
            characterString = ch.change(characterString); // call the change methode from class Change
        }
        
        return characterString;
        
        
                
    }
    
}
