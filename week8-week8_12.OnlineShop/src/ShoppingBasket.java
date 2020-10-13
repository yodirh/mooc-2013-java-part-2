

import java.util.HashMap;
import java.util.Map;


public class ShoppingBasket {
    
    private Map<String,Purchase> list;
    
    public ShoppingBasket(){
        this.list = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(list.containsKey(product)){
            list.get(product).increaseAmount();
        }else{
            list.put(product, new Purchase(product, 1, price));
        }
    }
    
    public int price(){
        int i=0;
        for (Purchase p : list.values()){
            i= i+ p.price();
        }
        return i;
    }
    
    public void print(){
        for (Purchase p : list.values()){
            System.out.println(p.toString());
        }
    }
}
