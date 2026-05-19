import java.util.Scanner;

public class TakingInput {
    static void main() {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter an integer: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("The sum of" + firstNumber + "and "+ secondNumber + ": " + sum);

        input.close(); //Best pratice for close the leaks

    }
}