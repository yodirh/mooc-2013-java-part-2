
import java.io.File;
import java.util.Scanner;

public class Printer {

    private File f;

    public Printer(String filename) throws Exception {
        this.f = new File(filename);
    }

    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(f);
        if (word.isEmpty()) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } else {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        }
        reader.close();

    }

}
