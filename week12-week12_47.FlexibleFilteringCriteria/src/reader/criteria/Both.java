
package reader.criteria;

public class Both implements Criterion{

    Criterion C1;
    Criterion C2;
    public Both(Criterion c1, Criterion c2){
        this.C1 = c1;
        this.C2 = c2;
    }

    @Override
    public boolean complies(String line) {
      if(C1.complies(line)&&C2.complies(line)){
          return true;
      }
      return false;
        
    }
    
}
