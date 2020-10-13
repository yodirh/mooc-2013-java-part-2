//@MoFo


public class Change {
    
    private char fromchr;
    private char tochar;
    
    public Change (char fromCharacter, char toCharacter){
        this.fromchr = fromCharacter;
        this.tochar= toCharacter;
    }
    
    public String change(String characterString){
        
        characterString = characterString.replace(fromchr, tochar);
        return characterString;
                
                
    }
    
}
