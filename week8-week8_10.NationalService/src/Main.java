public class Main {
    public static void main(String[] args) {
        // Test your code here!
        
        CivilService cv = new CivilService();
        System.out.println(cv.getDaysLeft());
        cv.work();
        System.out.println(cv.getDaysLeft());
        
    }
}
