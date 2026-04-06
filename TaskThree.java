import java.util.Scanner;


public class TaskThree{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter an integer: ");
             int integerInput = userInput.nextInt();

            int multiple5 = integerInput % 5;
            int divisible2 = integerInput % 2;



        if (multiple5 == 0){
                System.out.println("HiFive");
                }
           else {
                System.out.println("HiEven");
                }
           
    }

}
