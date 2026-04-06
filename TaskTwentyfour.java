import java.util.Scanner;


public class TaskTwentyfour{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter the base of the triangle: ");
             int baseTriangle = userInput.nextInt();

     System.out.print("Enter the height of the triangle: ");
             int heightTriangle = userInput.nextInt();

            double areaResult = 0.5 * baseTriangle * heightTriangle;

                System.out.println("Area " + areaResult);
 

         }

}
