//@MoFo

import java.util.Scanner;

public class Interface {

    Scanner reader;
    JumpOrder jump;

    public Interface(Scanner scanner) {
        this.reader = scanner;
        this.jump = new JumpOrder();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String input = this.reader.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                this.jump.addParticipant(new Participant(input, 0));

            }
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        int j = 1;
        while (true) {
            System.out.print("Write " + "\"jump\"" + " to jump; otherwise you quit:");
            String in = this.reader.nextLine();
            System.out.println("");
            if (in.equals("quit")) {
                System.out.println("Thanks!");
                System.out.println("");
                jump.finalResult();
                break;
            } else if (in.equals("jump")) {
                
                System.out.println("Round " + j);
                System.out.println("");
                jump.play();
                System.out.println("");
                System.out.println("Results of round " + j);
                jump.result();
                
            }
            j++;
        }

    }
   

}
