package Oops;

public class Student {
    //attributes
    public String name;
    public int age;
    public int id;
    public int nos;

    //Default constructor to set the value of the attributes
public Student()
{
    System.out.println("Student default constructor called");
}

//Parameterized Constructor

    public Student(int id, String name, int age , int nos)
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

}

