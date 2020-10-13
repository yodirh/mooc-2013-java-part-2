
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public String getlatinname(){
        return this.latinName;
    }
    
    public int getringingYear(){
        return this.ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object object){
        
         if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }
        Bird compared = (Bird) object;

        if (!this.latinName.equals(compared.getlatinname())) {
            return false;
        }

        if (this.ringingYear != compared.getringingYear()) {
            return false;
        }

        return true;
    }
    
    @Override
    public int hashCode() {
        return this.latinName.hashCode();
    }
    
    
    
}


