
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    
    private Map<String, Integer> list;
    private Map<String, Integer> stockList;

    public Storehouse(){
        this.list = new HashMap<String, Integer>();
        this.stockList = new HashMap<String, Integer>();
        
    }
    
    public void addProduct(String product, int price, int stock ){
        this.list.put(product, price);
        this.stockList.put(product, stock);
    }
    
    public int price(String product){
        if(this.list.containsKey(product)){
           return this.list.get(product); 
        }
        return -99;     
    }
    
    public int stock(String product){
        if(this.stockList.containsKey(product)){
            return this.stockList.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
            if(stockList.containsKey(product)&& stockList.get(product)>0){
                int i = stockList.get(product);
                i--;
                stockList.put(product, i);
                return true;
            }
            return false;       
    }
    
    public Set<String>products(){
        Set<String> set = new HashSet<String>();
        for (String k: list.keySet()){
            set.add(k);    
        }
        return set;
    }
    
}
