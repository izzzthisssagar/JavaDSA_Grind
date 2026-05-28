public class StringBasic {










    //print each character of string
    static  void printString(String s)
    {
        int len = s.length();
        for (int i = 0; i < len; i++)
            {
            System.out.println(s.charAt(i));
            }
    }
    static void main(String[] args)
    {

        String s = "abc";
        printString(s);
//        String firstName = "Sagar";
//        String lastName = new String("Thapa");
//
//        System.out.println(firstName + " " + lastName);
//
//        System.out.println(firstName.length());
//        System.out.println(lastName.length());
//        System.out.println(firstName.charAt(0));
    }
}
