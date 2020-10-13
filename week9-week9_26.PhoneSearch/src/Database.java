
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    private Map<String, ArrayList<String>> numdb;
    private Map<String, HashMap<String, String>> adddb;

    public Database() {

        this.numdb = new HashMap<String, ArrayList<String>>();
        this.adddb = new HashMap<String, HashMap<String, String>>();

    }

    public void add(String person, String number) {
        if (!this.numdb.containsKey(person)) {
            this.numdb.put(person, new ArrayList<String>());
        }
        this.numdb.get(person).add(number);
    }

    public ArrayList<String> searchNumber(String name) {
        if (!this.numdb.containsKey(name)) {
            return null;

        }
        return this.numdb.get(name);
    }

    public void searchPerson(String num) {
        int i = 0;
        for (String p : this.numdb.keySet()) {
            if (this.numdb.get(p).contains(num)) {
                System.out.println(p);
            } else {
                i++;
            }
        }
        if (i == this.numdb.size()) {
            System.out.println(" not found");
        }

    }

    public void addAddress(String name, String street, String city) {
        if (!this.adddb.containsKey(name)) {
            this.adddb.put(name, new HashMap<String, String>());
        }
        this.adddb.get(name).put(street, city);
    }

    public void infoSearch(String name) {
        if (!adddb.containsKey(name) && !numdb.containsKey(name)) {
            System.out.println(" not found");
        }
        
        else if (adddb.containsKey(name) && !numdb.containsKey(name)) {
            System.out.print(" address:");
            //System.out.println(this.adddb.get(name));
            for (String s : this.adddb.get(name).keySet()) {
                System.out.print(s + " ");
                System.out.println(this.adddb.get(name).get(s));
            }
            System.out.println("phone number not found");
            
            
            
        } else if (!adddb.containsKey(name) && numdb.containsKey(name)) {
            System.out.println("address unknown");
            System.out.println(" phone numbers:");
            for (String s : searchNumber(name)) {
                System.out.println(s);
            }
        }
        else if (adddb.containsKey(name) && numdb.containsKey(name)) {
            //System.out.println("address unknown");
            System.out.print(" address:");
            for (String s : this.adddb.get(name).keySet()) {
                System.out.print(s + " ");
                System.out.println(this.adddb.get(name).get(s));
            }
            System.out.println(" phone numbers:");
            for (String s : searchNumber(name)) {
                System.out.println(s);
            }
        }
       
    }

    public void removeInfo(String name) {
        this.numdb.remove(name);
        this.adddb.remove(name);
    }

    public void keySearch(String key) {
        Map<String, ArrayList> map = new HashMap<String, ArrayList>();
        
        for (String s : this.adddb.keySet()) {
            if (s.contains(key)) {
                System.out.println(s);
                infoSearch(s);
            }
            

        }
        
    }

}
