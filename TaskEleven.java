import java.util.Scanner;


public class TaskTwelve{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter the height: ");
             int integerInput1 = userInput.nextInt();

     System.out.print("Enter the weight: ");
             int integerInput2 = userInput.nextInt();

                double result1 = (integerInput1 * 50)- 50;
                double result2 = (integerInput2 * 75)- 75;
            
                 System.out.println("" + result1 + "" + result2);
            
    }

}
