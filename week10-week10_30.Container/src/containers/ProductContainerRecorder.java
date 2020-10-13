
package containers;

public class ProductContainerRecorder extends ProductContainer{
    
    private ContainerHistory containerhistory;
    
    public ProductContainerRecorder(String productname, double capacity, double initialVolume){
        super(productname,capacity);
        super.addToTheContainer(initialVolume);
        this.containerhistory = new ContainerHistory();
        this.containerhistory.add(initialVolume);
        
    }
    
    public String history(){
        return this.containerhistory.toString();
    }
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        containerhistory.add(getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        double i = super.takeFromTheContainer(amount);
        containerhistory.add(getVolume());
        return i ;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + containerhistory.maxValue());
        System.out.println("Smallest product amount: " + containerhistory.minValue());
        System.out.println("Average: " + containerhistory.average());
        System.out.println("Greatest change: " + containerhistory.greatestFluctuation());
        System.out.println("Variance: " + containerhistory.variance());
    }
}
