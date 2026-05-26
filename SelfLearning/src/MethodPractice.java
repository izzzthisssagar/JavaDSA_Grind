import java.util.Scanner;

public class MethodPractice {


    String WelcomeMessage() {
        System.out.println("Welcome to Method Pratice ");

        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        return "Hello " + name;
    }


    public  static void main(String[] args)
    {
        MethodPractice practice = new MethodPractice();
        String message = practice.WelcomeMessage();
        System.out.println(message);

    }
}
