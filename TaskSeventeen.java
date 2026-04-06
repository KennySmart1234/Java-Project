import java.util.Scanner;


public class TaskSeventeen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter first length: ");
             int length1 = userInput.nextInt();
     System.out.print("Enter second length: ");
             int length2 = userInput.nextInt();
                
            int length11 = length1 * length1;
            int length22 = length2 * length2;
            int lengthSum = length11 * length22;

      
                double hypotenuse = lengthSum;
                double result = Math.sqrt(hypotenuse);
                    System.out.println("hypotenuse " + result);

    }

}
