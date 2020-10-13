//@MoFo
import java.util.Scanner;

public class Reader {
    
    private Scanner scan;
    
    public Reader (){
        this.scan = new Scanner(System.in);
    }
    
    public String readString(){
        String str = scan.nextLine();
        return str;
    }
    
    public int readInteger(){
        int num = Integer.parseInt(scan.nextLine());
        return num;
        
    }
    
}
