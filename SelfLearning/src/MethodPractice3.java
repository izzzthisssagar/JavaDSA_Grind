import java.util.Scanner;

public class MethodPractice3 {

    boolean IsEven(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
            return true;
        } else {
            System.out.println("The number is not even");
            return false;
        }
    }

    public static void main(String[] args)
    {
        MethodPractice3 obj = new MethodPractice3();

        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        obj.IsEven(number);

    }
}
