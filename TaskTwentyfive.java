import java.util.Scanner;


public class TaskTwentyfive{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter three input integer: ");
             int inputInteger = userInput.nextInt();

              int integerDivision1 = inputInteger / 100;
              double integerDivision2 = inputInteger % 10;


        if (integerDivision1  == integerDivision2){
                System.out.println(inputInteger);
                System.out.println("it is palindrome");
                 }
                else
                System.out.println("it is not palindrome");
 

         }

}
