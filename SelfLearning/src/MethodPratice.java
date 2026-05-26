import java.util.Scanner;

public class MethodPratice {


    String WelcomeMessage() {
        System.out.println("Welcome to Method Pratice ");

        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        return "Hello " + name;
    }


    public  static void main(String[] args)
    {
        MethodPratice pratice = new MethodPratice ();
        String message = pratice.WelcomeMessage();
        System.out.println(message);

    }
}
