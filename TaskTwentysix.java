import java.util.Scanner;


public class TaskTwentysix{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter your PIN: ");
             int PinInput = userInput.nextInt();


              int storedPin = 1234;
              


        if (PinInput  == storedPin){
                System.out.println("Welcome");
                System.out.println("PIN is correct");
                System.out.println("Your balance is $1000");
                 }
                else
                System.out.println("Incorrect PIN");
 

         }

}
