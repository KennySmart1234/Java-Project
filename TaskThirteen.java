import java.util.Scanner;


public class TaskThirteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an intiger: ");
             int integerInput1 = userInput.nextInt();

     System.out.print("Enter another integer: ");
             int integerInput2 = userInput.nextInt();

              int result1 = integerInput1 / integerInput2;
             
                if (integerInput1 == 0){
                    System.out.println("Error!!! Enter a number above than zero");                    
                    }
                else
            System.out.println(result1);
            
    }

}
