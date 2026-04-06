import java.util.Scanner;


public class TaskTwentyone{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter coefficient of A: ");
             int coefficientA = userInput.nextInt();
     System.out.print("Enter coefficient of B: ");
             int coefficientB = userInput.nextInt();
     System.out.print("Enter coefficient of C: ");
             int coefficientC = userInput.nextInt();


          if (coefficientA == 0){
            System.out.println("The equation has no unique solution\n\n\n"); }
    int result = coefficientC - coefficientB / coefficientA;

          if (coefficientA >= 1){
              System.out.println("solution X = " + result); }  

             

    }

}
