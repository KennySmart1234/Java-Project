import java.util.Scanner;


public class TaskTwenty{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a any four digit number: ");
             int digitInput = userInput.nextInt();
               int divisionDigit1 = digitInput % 10;
               int divisionDigit11 = digitInput / 10;
            

                int divisionDigit2 = divisionDigit11 % 10;
                int divisionResult22 = divisionDigit11 / 10;
     

                int divisionDigit3 = divisionResult22 % 10;
                int divisionResult33 = divisionResult22 / 10;

                int divisionDigit4 = divisionResult33 % 10;
                int divisionDigit44 = divisionResult33 / 10;
               


    System.out.print(divisionDigit1 +""+ divisionDigit2 + ""+ divisionDigit3 + "" + divisionDigit4 + "\n");


}

}
