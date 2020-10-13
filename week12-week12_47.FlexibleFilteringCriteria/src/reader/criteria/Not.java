
package reader.criteria;

public class Not implements Criterion{
    
    Criterion c1;
    public Not(Criterion c1){
        this.c1 = c1;
    }

    @Override
    public boolean complies(String line) {
        if(!c1.complies(line)){
            return true;
        }
        return false;
    }
    
}
