
//@MoFo

import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
   private  Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }

    public void start() {
        
        print();

        while (true) {
            System.out.print("Statement: ");
            String command = this.reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("cheers!");
                break;
            }
            else if (command.equals("add")) {
                System.out.print("In Finnish: ");
                String finn = this.reader.nextLine();
                System.out.print("Translation: ");
                String trans = this.reader.nextLine();
                add(finn, trans);
                System.out.println("");
            }
            else if (command.equals("translate")) {
                System.out.println("Give a word: ");
                String word = this.reader.nextLine();
                System.out.print("Translation: ");
                System.out.println(translate(word));
                System.out.println("");

            }
        }

    }

    public void add(String w, String tr) {
        this.dict.add(w, tr);
    }

    public String translate(String w) {
        return this.dict.translate(w);
    }
    
    public void print(){
        System.out.println("Statement:");
        System.out.println("add - adds a word and prints its translation");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
    }

}
