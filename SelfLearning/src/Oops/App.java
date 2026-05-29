package Oops;

public class App {
    static void main(String[] args) {

        //Default constructor
//        Student s1 = new Student();
//        s1.name="Sagar";
//        s1.age=18;
//        s1.id=1;
//
//
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//        System.out.println(s1.id);
//
//        s1.Bunk();
//        s1.Sleep();
//        s1.Study();



        //Parameterized Constructor

        //Student A = new Student( 1 ,"Sagar Thapa", 22 ,5 , "koi xaina");
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.nos);
//        System.out.println(A.name);
//
//        A.Study();
//        A.Sleep();
//        A.Bunk();

        //Copy constructor

//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.nos);
//
//        B.Sleep();

        //Encapsulation

        Student A = new Student( 1 ,"Sagar Thapa", 22 ,5 , "koi xaina");
                System.out.println(A.GetName());
        System.out.println(A.GetAge());
        System.out.println(A.GetNos());
        System.out.println(A.GetName());
        System.out.println(A.GetGf());

        System.out.println(A.SetAge(55));

        A.Bunk();
       // A.GfChatting();



    }
}
