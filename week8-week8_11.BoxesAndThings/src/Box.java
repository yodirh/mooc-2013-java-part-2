
import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxweight;
    private ArrayList<ToBeStored> list;

    public Box(double maxweight) {
        this.maxweight = maxweight;
        this.list = new ArrayList<ToBeStored>();
    }

    //interface as methode parameter.
    public void add(ToBeStored toBeStored) {
        double i = this.maxweight - weight();
        if (toBeStored.weight() <= i) {
            this.list.add(toBeStored);

        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored t : this.list) {
            weight = weight + t.weight();
        }
        return weight;
    }

    public int noOfThings() {
        return this.list.size();
    }

    @Override
    public String toString() {
        return "Box: " + noOfThings() + " things, total weight " + weight() + " kg";
    }
}
