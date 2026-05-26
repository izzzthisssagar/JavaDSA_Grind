import java.util.Scanner;

public class MethodPractice5 {

    void CalculatePercentage(int obtained, int total) {
        double percentage = (double) obtained / total * 100;
        System.out.printf("Your percentage is %.2f%%\n", percentage);
    }

    public static void main(String[] args) {
        MethodPractice5 obj = new MethodPractice5();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter obtained marks:");
        int obtained = sc.nextInt();
        sc.close();

        obj.CalculatePercentage(obtained, 100);
    }
}
