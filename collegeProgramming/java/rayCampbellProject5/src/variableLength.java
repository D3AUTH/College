import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
   // instance variables
   private static BufferedReader bufReader;
  
   // main method
   public static void main(String[] args) throws IOException {
       int option;
       double value;
       bufReader = new BufferedReader(new InputStreamReader(System.in));
       Rectangle rect = new Rectangle();
       while(true){
           printMenu();
           option = takeOption();
           try{
               switch(option){
               case 1:
                   System.out.println("Enter length");
                   value = Double.parseDouble(bufReader.readLine());
                   try {
                       rect.setLength(value);
                   }
                   catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 2:
                   System.out.println("Enter width");
                   value = Double.parseDouble(bufReader.readLine());
                   try {
                       rect.setWidth(value);
                   }
                   catch(IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 3:
                   System.out.println("Area : "+rect.getArea());
                   break;
               case 4:
                   System.out.println("Perimeter : "+rect.getPerimeter());
                   break;
               case 5:
                   System.exit(1);
               default:
                   System.out.println("Invalid option.");
               }
           }
           catch(Exception e){
               System.out.println("Invalid option!!");
           }
       }
   }
  
   // Prints menu
   public static void printMenu(){
       System.out.println("1. Set length");
       System.out.println("2. Set width");
       System.out.println("3. Get Area");
       System.out.println("4. Get Perimeter");
       System.out.println("5. Exit");
   }
  
   // Takes option
   public static int takeOption(){
       while(true){
           try{
               System.out.println("Choose your option..");
               return Integer.parseInt(bufReader.readLine());
           }
           catch(Exception e){
               System.out.println("Invalid option.");
           }
       }  
   }
}