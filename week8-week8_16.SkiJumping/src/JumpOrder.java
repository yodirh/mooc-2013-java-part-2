//@MoFO

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import java.util.concurrent.ThreadLocalRandom;

public class JumpOrder {

    ArrayList<Participant> alist;
    ArrayList<Participant> lengthlist = new ArrayList<Participant>();
    HashMap<String, Integer> map;
    Set<String> set = new HashSet<String>();


    public JumpOrder() {
        this.alist = new ArrayList<Participant>();
        this.map = new HashMap<String, Integer>();
    }

    public void addParticipant(Participant p) {
        alist.add(p);
        this.map.put(p.getName(), p.getPoint());
        set.add(p.getName());
    }

    public int Length() {
        int length = ThreadLocalRandom.current().nextInt(60, 120);
        return length;
    }

    public ArrayList<Integer> judgeVotes() {
        ArrayList<Integer> judgevotes = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            judgevotes.add(ThreadLocalRandom.current().nextInt(10, 20));
        }
        return judgevotes;
    }

    public void play() {
        Collections.sort(alist);
        int i = 1; 
        System.out.println("Jumping order:");
        for (Participant k : alist) {
            System.out.println("  " + i + ". " + k.getName() + " (" + k.getPoint() + " points)");
            i++;
        }
    }

    public void result() {

        for (Participant l : alist) {
            int L = Length();
            int KK = map.get(l.getName());
            lengthlist.add(new Participant(l.getName(), L));
            ArrayList<Integer> jlist = judgeVotes();
            
            System.out.println("  " + l.getName());
            System.out.println("    length: " + L);
            System.out.println("    judge votes: " + jlist);
            
            Collections.sort(jlist);
            jlist.remove(0);
            jlist.remove(jlist.size() - 1);

            for (int j : jlist) {
                L = L + j;
            }
            KK=KK+L; 
            map.put(l.getName(), KK);    
        }
        for (String s : set) {
            int u = 0;
            addParticipant(new Participant(s, map.get(s)));
            alist.remove(u);
            u++;
        }
        System.out.println("");
    }

    public void finalResult() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(alist);
        Collections.reverse(alist);
        lengthList();
        int i = 1;
        for (Participant p : alist) {
            System.out.println(i + "           " + p.getName() + " (" + p.getPoint() + " points)");
            System.out.print("            jump lengths: ");
            for(Participant par:lengthlist){
                
                if(par.getName().equals(p.getName()) ){
                    System.out.print(par.getPoint() + " m,");
                }
            }
            System.out.println("");
                    
            i++;
        }
        System.out.println("");
    }
    
    public void lengthList(){
        Collections.sort(lengthlist, new SortByName());
    }
    
}
