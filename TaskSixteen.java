import java.util.Scanner;


public class TaskSixteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter temperature Celsius: ");
             int temprature = userInput.nextInt();

                



        if (temprature < 0){
                System.out.println("below");
                }
           else if (temprature <= 15){
                System.out.println("cold");
                }
           else if (temprature <= 25){
                System.out.println("warm");
                }
           else if (temprature > 25){
                System.out.println("hot");
                }


    }

}
