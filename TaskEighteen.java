import java.util.Scanner;


public class TaskEighteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter two digit integer: ");
             int integerInput = userInput.nextInt();




                if (integerInput <= 0){
                System.out.println("less unit");
                }
               else if (integerInput <= 9){
                System.out.println("equal unit digit");
                }
               else if (integerInput > 9){
                System.out.println("grater than unit");
                }

             

    }

}
