
//@MoFO
import java.util.Scanner;

public class Interface {

    Scanner reader;
    Airplane air;

    public Interface(Scanner reader, Airplane airplane) {
        this.reader = reader;
        this.air = airplane;

    }

    public void start() {
        System.out.println("Airport panel\n"
                + "--------------------");

        while (true) {
            operationMenu();
            String command = this.reader.nextLine();

            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                planeInput();
            } else if (command.equals("2")) {
                flightInput();
            }
        }

        System.out.println("Flight service\n"
                + "------------");

        while (true) {
            serviceMenu();
            String cmmd = this.reader.nextLine();

            if (cmmd.equals("x")) {
                break;
            } else if (cmmd.equals("1")) {
                this.air.printPlanes();
            } else if (cmmd.equals("2")) {
                this.air.printFlight();
            } else if (cmmd.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();

                this.air.printPlainInfo(id);
            }
        }

    }

    public void operationMenu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit");
    }

    public void serviceMenu() {
        System.out.println("Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit");
    }

    public void planeInput() {
        System.out.print("Give plane ID: ");
        String name = this.reader.nextLine();

        System.out.print("Give plane capacity: ");
        int cap = Integer.parseInt(this.reader.nextLine());

        this.air.addAirPlane(name, cap);

    }

    public void flightInput() {
        System.out.print("Give plane ID: ");
        String fname = this.reader.nextLine();

        System.out.print("Give departure airport code: ");
        String dep = this.reader.nextLine();

        System.out.print("Give destination airport code: ");
        String des = this.reader.nextLine();

        String route = dep + "-" + des;
        this.air.addFlight(fname, route);
    }
}
