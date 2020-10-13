
public class Book implements ToBeStored{
    
    private String writer;
    private String name;
    private double weight;
    
    public Book (String writer, String name, double weight ){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    public double weight(){
        
        return this.weight;
    }
    
    public String getWriter(){
        return this.writer;
    }
    
    public String getBookName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return getWriter() +": "+ getBookName();
    }
    
}
