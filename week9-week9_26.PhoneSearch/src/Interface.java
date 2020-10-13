
import java.util.Scanner;

public class Interface {

    Scanner reader;
    Database db;

    public Interface(Scanner scanner, Database db) {
        this.reader = scanner;
        this.db = db;
    }

    public void start() {
        intro();

        while (true) {
            System.out.print("command: ");

            String input = this.reader.nextLine();
            if (input.equals("x")) {
                break;
            }

            if (input.equals("1")) {
                System.out.print("whose number: ");
                String person = this.reader.nextLine();
                System.out.println("number: ");
                String number = this.reader.nextLine();
                this.db.add(person, number);
                System.out.println("");
            }
            if (input.equals("2")) {
                System.out.print("whose number: ");
                String name = this.reader.nextLine();
                //System.out.println(db.searchNumber(name));
                if (db.searchNumber(name) == null) {
                    System.out.println("not found");
                } else {
                    
                    for (String s : db.searchNumber(name)) {
                        System.out.println(s);
                    }
                }
                System.out.println("");
            }
            if (input.equals("3")) {
                System.out.println("number: ");
                String num = this.reader.nextLine();
                db.searchPerson(num);
                System.out.println("");
            }
            if (input.equals("4")) {
                System.out.print("whose address: ");
                String name = this.reader.nextLine();
                System.out.print("street: ");
                String street = this.reader.nextLine();
                System.out.print("city: ");
                String city = this.reader.nextLine();
                db.addAddress(name, street, city);
                System.out.println("");
            }
            if (input.equals("5")) {
                System.out.print("whose information: ");
                String name = this.reader.nextLine();
                db.infoSearch(name);
                System.out.println("");
            }
            if (input.equals("6")) {
                System.out.print("whose information: ");
                String name = this.reader.nextLine();
                db.removeInfo(name);
                System.out.println("");
            }
            if (input.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                String key = this.reader.nextLine();
                db.keySearch(key);
                System.out.println("");
            }
        }

    }

    public void intro() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + "1 add a number\n"
                + "2 search for a number\n"
                + "3 search for a person by phone number\n"
                + "4 add an address\n"
                + "5 search for personal information\n"
                + "6 delete personal information\n"
                + "7 filtered listing\n"
                + "x quit\n"
                + "");

    }

}
