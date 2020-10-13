
package containers;

public class ProductContainer extends Container{
    
    private String productname;
    public ProductContainer(String productName, double capacity){
        super(capacity);
        this.productname = productName;
        
    }
    
    public String getName(){
        return this.productname;
    }
    
    public void setName(String newName){
        this.productname= newName;
    }
    
    @Override
    public String toString(){
        return getName() + ": " + super.toString();
    }
    
}
