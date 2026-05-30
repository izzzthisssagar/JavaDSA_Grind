package Polymorphism;

public class Calculator {

    int add(int a,int b){
        return a+b;
    }


    //overloading add
    int add(int a,int b,int c)
    {
        return a+b+c;
    }

    double add(double a,double b , int c, int d)
    {
        return a+b+c+d;
    }
}
