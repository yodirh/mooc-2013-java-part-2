
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand>{
    
    private List<Card> list;
    
    public Hand(){
        this.list = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.list.add(card);
    }
    
    public  void print(){
        for(Card c: list){
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(list);
    }
    
    //get total value of cards
    public int totalValue(){
        int i = 0;
        for(Card c:list){
            i += c.getValue();
        }
        return i;
    }
    
    @Override
    public int compareTo(Hand hand){
        
       return  totalValue()-  hand.totalValue();
    }
    
    public void sortAgainstSuit(){
        sort(); //sort the cards in hand
        Collections.sort(list, new SortAgainstSuitAndValue());
    }
}
