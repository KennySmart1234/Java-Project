import java.util.Scanner;

public class Number{
public static void main(String[] args){

    System.out.print("Enter an integer: ");
    Scanner userInput = new Scanner(System.in);
        int integer1 = userInput.nextInt();
        int Square = integer1;
        int sum1 = (Square * Square);
        System.out.printf("%s %d %n", "The square of your integer is: ",sum1);
        
        
    System.out.print("Enter another integer: ");
    Scanner cubeInput = new Scanner(System.in);
        int integer2 = cubeInput.nextInt();
        int Cube = integer2;
        int sum2 = (Cube * Cube * Cube);
        System.out.printf("%s %d %n", "The cube of your integer is: ",sum2);

    }
}
