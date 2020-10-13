
package reference.domain;

public enum Rating {
    
    BAD(-5),
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);
    
    
    int num;
    private Rating(int num){
        this.num = num;
    }
    
    public int getValue(){
        return this.num;
    }
    
}
