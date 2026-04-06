import java.util.Scanner;


public class TaskTwentytwo{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter double number: ");
             double double1 = userInput.nextDouble();
     System.out.print("Enter another double: ");
             double double2 = userInput.nextDouble();
              double differenceResult = double1 - double2;
              double sumResult = double1 * double2;


          if (double1 > double2){
         System.out.println("first input is larger " + double1); }
          if (double2 > double1){
         System.out.println("first input is smaller " + double1); }
          if (double2 > double1){
         System.out.println("second input is larger " + double2); }
          if (double1 > double2){
         System.out.println("second input is smaller " + double2); }

            System.out.println("Sum = " + double1 + double2);
            System.out.println("Difference = " + differenceResult);
            System.out.println( "Product = " + sumResult);
             

    }

}
