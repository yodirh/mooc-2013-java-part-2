//@MoFo

import java.util.ArrayList;
import java.util.HashMap;

public class Airplane {

    private HashMap<String, Integer> map;
    private ArrayList<String> list;

    public Airplane() {
        this.map = new HashMap<String, Integer>();
        this.list = new ArrayList<String>();
    }

    public void addAirPlane(String name, int capacity) {
        map.put(name, capacity);
    }

    public void printPlanes() {
        for (String k : map.keySet()) {
            System.out.println(k + " (" + map.get(k) + " ppl)");
        }
    }

    public void addFlight(String name, String route) {
        String flkey = name + " (" + map.get(name) + " ppl)" + " (" + route + ")";
        list.add(flkey);

    }

    public void printFlight() {
        for (String k : list) {
            System.out.println(k);
        }
    }

    public void printPlainInfo(String name) {
        for (String k : map.keySet()) {
            if (k.equals(name)) {
                System.out.println(k + " (" + map.get(k) + " ppl)");
            }
        }
    }

}
