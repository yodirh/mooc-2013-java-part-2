public class Main {
    public static void main(String[] args) {
        // Test your program here
        
        String word = "caarot";
        Change change1 = new Change('a', 'b');
        
        word = change1.change(word);
        
        System.out.println(word);
        
        
        Changer scandies = new Changer();
        scandies.addChange(new Change('ä', 'a'));
        scandies.addChange(new Change('ö', 'o'));
        
        System.out.println(scandies.change("ääliö älä lyö, ööliä läikkyy"));
    }
}
