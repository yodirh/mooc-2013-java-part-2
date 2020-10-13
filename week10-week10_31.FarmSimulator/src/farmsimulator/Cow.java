
package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{
    
    private double amount=0;
    private int udder;
    private String name;
    private Random random = new Random();
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        int i = new Random().nextInt(NAMES.length);
        this.name= NAMES[i];
        this.udder = 15 + random.nextInt(26);
        
    }
    public Cow(String name){
        this.name = name;
        this.udder = 15 + random.nextInt(26);
    }
    
    public String getName(){
        return this.name ;
    }
    
    public double getCapacity(){ 
        return this.udder;
    }
    
    public double getAmount(){
        return amount;
    }
    
    @Override
    public String toString(){
        return this.name + " "+ Math.ceil(getAmount())+ "/" + Math.ceil(getCapacity()) ;
    }
    
    @Override
    public double milk(){
        double i = amount;
        amount = 0;
        return i;
    }
    
    @Override
    public void liveHour(){
        double am = (1.3 * random.nextDouble()) + 0.7;
        if (this.amount + am <= this.udder) {
            this.amount += am;
        } else {
            this.amount = this.udder;
        }
        
    }
    
}
