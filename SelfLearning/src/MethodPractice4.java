public class MethodPractice4 {

    void GetMaximum(int a , int b)
    {
        if(a>b)
        {
            System.out.println(a + " is the maximum");
        }
        else
        {
            System.out.println(b + " is the maximum");
        }
    }

    static void main(String[] args)
    {
        MethodPractice4 obj = new MethodPractice4();
        obj.GetMaximum(3,4);

    }
}





