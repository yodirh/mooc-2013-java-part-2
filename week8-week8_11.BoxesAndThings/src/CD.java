
public class CD implements ToBeStored {
    
    private String artist;
    private String title;
    private int year;
    
    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    
    public double weight(){
        return 0.1;
    }
    
    public String getArtist(){
        return this.artist;
    }
    public String getTitle(){
        return this.title;
    }
    public int getYear(){
        return this.year;
    }
    
    @Override
    public String toString(){
        return getArtist() +": "+ getTitle() +" ("+ getYear() + ")";
    }
}
