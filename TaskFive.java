import java.util.Scanner;
import java.util.Random;

public class TaskFive{
public static void main(String[] agrs){

             Scanner userInput = new Scanner(System.in);
              Random random = new Random();
    
                int myrandom = random.nextInt();


         
     System.out.print("Enter a guess: ");
             int integerInput1 = userInput.nextInt();

               double guess = integerInput1 % myrandom;
 

            if (guess == 0){
                System.out.println("Guess is correct");
                }
//            else (guess == 1)
//                {
//                 System.out.println("Guess is not correct");
//                        }
 }

}
