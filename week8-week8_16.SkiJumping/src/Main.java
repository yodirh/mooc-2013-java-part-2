
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        JumpOrder jump = new JumpOrder();
        
        Interface ui = new Interface(reader);
        ui.start();    
        
    }
}
