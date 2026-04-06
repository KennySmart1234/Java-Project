import java.util.Scanner;


public class TaskFifteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter enter three digit number: ");
             int digitInput = userInput.nextInt();
                    
              int resultDivision1  = digitInput % 10;
              int resultDivision2  = digitInput / 10;
              int resultDivision3  = resultDivision2 % 10;
              int resultDivision4  = resultDivision2 / 10;
              int resultDivision5  = resultDivision4 % 10;
              int resultDivision7  = resultDivision4 / 10;




                int sum = resultDivision1 +  resultDivision3 + resultDivision5;

               System.out.println("Sum = " + sum);
           
             
                    
                 
      
    }

}
