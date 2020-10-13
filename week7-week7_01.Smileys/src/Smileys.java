
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         //printWithSmileys("Matti");
         printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        
        int i = 0;
        if(characterString.length()<5){
             i = 5;
        }else{
            i = 6;
        }
        
        for (int j = 0; j<i; j++){
            System.out.print(":)");   
        }
        System.out.println("");
        
        if(characterString.length()%2==1){
            System.out.println(":) "+ characterString+ "  :)");
        }
        else{
            System.out.println(":) "+ characterString+ " :)");
        }

        for (int j = 0; j<i; j++){
            System.out.print(":)");
        }
        System.out.println("");
    }
    
    

}
