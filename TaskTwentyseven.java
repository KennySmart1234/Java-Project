import java.util.Scanner;


public class TaskTwentyseven{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter principal(p): ");
             double principal = userInput.nextInt();
     System.out.print("Enter annual interest rate: ");
             double interest = userInput.nextInt();
     System.out.print("Enter time in year: ");
             double time = userInput.nextInt();

                double interestPercentage = interest / 100;
      double simpleInterest = principal * interestPercentage * time;
      double simpleInterestResult = simpleInterest/100;


        double compoundSquare =  (1 + interestPercentage) * (1 + interestPercentage);

        double compoundInterest = principal * compoundSquare;
        System.out.print("simple Interest: " + simpleInterestResult + "\ncompound Interest " + compoundInterest + "\n");
         }

}
