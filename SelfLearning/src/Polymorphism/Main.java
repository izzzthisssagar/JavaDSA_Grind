package Polymorphism;

public class Main {
    public static void main(String[] args)
    {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(1,2));
//        System.out.println(calculator.add(1,2,3));
//        System.out.println(calculator.add(1,2.5,3,4));


        //Runtime  polymorphism
        Circle circle = new Circle();
        doDrawing(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape shape = new Shape();
        shape.draw();

    }

    public static void doDrawing(Shape s)
    {
     s.draw();
    }


}
