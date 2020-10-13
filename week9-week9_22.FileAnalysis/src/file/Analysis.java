
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    
    private File file;
    private Scanner reader;
    
    public Analysis(File file) throws Exception{
       this.file= file; 
       this.reader= new Scanner(this.file);
    }
    
    public int lines() throws FileNotFoundException{
        this.reader= new Scanner(this.file);
        int i = 0;
        while(this.reader.hasNextLine()){
            String line= this.reader.nextLine();
            i++;
        }
        reader.close();
        return i;
    }
    
    public int characters() throws FileNotFoundException{
        this.reader= new Scanner(this.file);
        int  i= 0;
        while(this.reader.hasNextLine()){
            String token = this.reader.nextLine();
            i = i+token.length();
               
        }
        reader.close();
        i = i + lines();
        return i;
        
    }
    
}
