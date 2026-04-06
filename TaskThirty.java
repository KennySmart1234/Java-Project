import java.util.Scanner;


public class TaskThirty{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter the current hour: ");
             int hourInput = userInput.nextInt();
             

            if (hourInput == 5 || hourInput <= 11){
                System.out.println("Good Morning");
                }
           else if (hourInput == 12 || hourInput <= 17){
                System.out.println("Good Afternoon");
                }
           else if (hourInput == 18 || hourInput <= 21){
                System.out.println("Good Evening");
                }
           else if (hourInput == 22 || hourInput <= 24){
                System.out.println("Good Night");
                }
           else if(hourInput == 1 || hourInput <= 4){
                System.out.println("Good Night");
                }
            else 
                System.out.println("Out of Range");
        }
    }

