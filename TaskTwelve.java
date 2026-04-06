import java.util.Scanner;


public class TaskTwelve{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an integer: ");
             int integerInput1 = userInput.nextInt();

     System.out.print("Enter an integer: ");
             int integerInput2 = userInput.nextInt();

                double result4 = integerInput1 % 4;
                double result5 = integerInput2 % 5;


            if (result4 == 0 && result5 == 0){
                    System.out.print("divisible by 4 and 5");}
              else if
                  (result4 == 0 || result5 == 0){
                System.out.print("divisible by 4 and 5");}
              else if
                    (result4 == 0 ^ result5 == 0){
                    System.out.print("divisible by 4 and 5");}
    }

}
