import java.util.Scanner;


public class TaskTen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter weight: ");
             int weight = userInput.nextInt();
             

            if (weight < 0 || weight <= 2){
                System.out.println("Ship fee = 2.5$");
                }
           else if (weight < 2 || weight <= 4){
                System.out.println("Ship fee = 4.5$");
                }
           else if (weight < 4 || weight <= 10){
                System.out.println("Ship fee = 7.5$");
                }
           else if (weight < 10 || weight <= 20){
                System.out.println("Ship fee = 10.5$");
                }
           else if(weight > 20){
                System.out.println("Package can not be Shipped");
                }
        }
    }
