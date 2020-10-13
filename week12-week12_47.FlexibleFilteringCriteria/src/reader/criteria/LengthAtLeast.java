
package reader.criteria;

public class LengthAtLeast implements Criterion{
    
    private int least;
    public LengthAtLeast(int least){
        this.least = least;
    }

    @Override
    public boolean complies(String line) {
        if(line.length()>=this.least){
            return true;
        }
        return false;
    }
    
    
}
