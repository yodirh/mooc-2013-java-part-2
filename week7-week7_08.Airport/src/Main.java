
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Airplane plane = new Airplane();
         
        Interface ui = new Interface(reader, plane);
        
       ui.start();
    }
}
