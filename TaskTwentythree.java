import java.util.Scanner;


public class TaskTwentythree{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter integer: ");
             int integerInput = userInput.nextInt();

              if (integerInput < 99 ){
                System.out.println("it is not three digit");
                    }

              if (integerInput >= 100){
                System.out.println("it is three digit number or more");
                    }
                else{
                System.out.println("it is not three digit");
                    }

    }

}
