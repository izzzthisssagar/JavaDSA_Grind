public class MethodPractice2 {

    int Sum(int a, int b){

        int sum = a + b;

        String message = "Sum is: " + sum;
        System.out.println(message);
        return sum;
    }

    public static void main(String[] args)
    {
        MethodPractice2 practice = new MethodPractice2();
        int sum = practice.Sum(1, 2);
        System.out.println(sum);
    }
}

