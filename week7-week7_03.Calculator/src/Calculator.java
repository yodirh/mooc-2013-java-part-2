//@MoFo

public class Calculator {

    private Reader reader;
    private int i;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.println("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        this.i++;
        int[] arr = userinput();
        System.out.println("sum of the values " + Math.addExact(arr[0], arr[1]));

    }

    private void difference() {
        this.i++;
        int[] arr = userinput();
        System.out.println("difference of the values " + Math.subtractExact(arr[0], arr[1]));

    }

    private void product() {
        this.i++;
        int[] arr = userinput();
        System.out.println("product of the values " + Math.multiplyExact(arr[0], arr[1]));

    }

    private void statistics() {
        System.out.println("calculation done " + this.i);
    }

    private int[] userinput() {

        int[] arr = new int[2];
        System.out.println("value1: ");
        arr[0] = reader.readInteger();
        System.out.println("value2: ");
        arr[1] = reader.readInteger();

        return arr;
    }

}
