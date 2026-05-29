package Oops;

public class Student {
    //attributes
    private String name;
    private int age;
    private int id;
    private int nos;
    private String gf;

    public String GetName() {
        return this.name;
    }
    public int GetAge() {
        return this.age;
    }
    public int SetAge(int newAge) {

        //We can add extra layer of authentication
        return this.age = newAge;
    }
    public int GetId() {
        return this.id;
    }
    public int GetNos() {
        return this.nos;
    }
    public String GetGf() {
        return this.gf;
    }


    //Default constructor to set the value of the attributes
public Student()
{
    System.out.println("Student default constructor called");
}

//Parameterized Constructor

    public Student(int id, String name, int age , int nos , String gf)
    {
        System.out.println("Student parameterized constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    //Copy Constructor
    public Student(Student scope) //SCOPE REPRESENT A
    {
        System.out.println("Student copy constructor called");
        this.id = scope.id;
        this.name = scope.name;
        this.age = scope.age;
        this.nos = scope.nos;
        this.gf = scope.gf;
    }


    //Methods or behaviour
    public void Study()
    {
        System.out.println( name + "Studying");
    }

    public void Sleep()
    {
        System.out.println( name + "Sleeping");
    }

    public void Bunk()
    {
        System.out.println( name + "Bunking");
    }

    private  void GfChatting()
    {
        System.out.println( name + "GfChatting");
    }



}

