
package people;

public class Student extends Person{
    
    private int creadits;
    public Student(String name, String address){
         super(name,address);
         this.creadits = 0;
    }
    
    public int credits(){
        return this.creadits;
    }
    
    public void study(){
        this.creadits ++;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\n  credits " + credits();
    }
}
