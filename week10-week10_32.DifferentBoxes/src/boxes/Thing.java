//@MoFo

package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return 7;
        }
        return this.name.hashCode();
    }
    
    @Override
    public boolean equals(Object object) {
        if (getClass() != object.getClass()) {
            return false;
        }
        
        Thing compared = (Thing) object;
        
        if (this.name == null || !this.name.equals(compared.getName())) {
            return false;
        }
        return true;
    }

}
