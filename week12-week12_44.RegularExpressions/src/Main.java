
public class Main {

    public static void main(String[] args) {
        // write test code here
        if (clockTime("20:00:00") == true) {
            System.out.println("The form is fine");
        } else {
            System.out.println("The form is wrong");
        }
    }

    public static boolean isAWeekDay(String str) {
        if (str.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;

    }

    public static boolean allVowels(String string) {
        if (string.matches("[aeiouäö]+")) {
            return true;
        }
        return false;

    }

    public static boolean clockTime(String string) {
        if (string.matches("\\d\\d:\\d\\d:\\d\\d")) {
            String[] part = string.split(":");

            int a = Integer.parseInt(part[0]);
            int b = Integer.parseInt(part[1]);
            int c = Integer.parseInt(part[2]);

            return a < 24 && b <= 59 && c <= 59;
        }
        return false;
    }
}
