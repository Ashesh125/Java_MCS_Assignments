package assignment_2.Q1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setRadius(60);
        System.out.println(c1.toString());
        System.out.println("Area of Circle 1: " + c1.getArea());
        System.out.println("Circumference of Circle 1: " + c1.getCircumference());

        Circle c2 = new Circle(100, "green");
        System.out.println(c2.toString());
        System.out.println("Area of Circle 1: " + c2.getArea());
        System.out.println("Circumference of Circle 1: " + c2.getCircumference());

        c1.setColor("white");
        System.out.println(c1.toString());

        // this gives error as radius is private and is not visible outside the scope of
        // the Class
        // c1.radius = 100;
        // but i made color public so I can access/modify color outside the scope of the
        // Circle Class
        c1.color = "yellow";
        System.out.println(c1.color);

        Circle c3 = new Circle();
        c3.setRadius(4.4);
        System.out.println("radius is: " + c3.getRadius());
        c3.setColor("black");
        System.out.println("color is: " + c3.getColor());

        // System.out.println(c3.setRadius(45)); <---- cannot print void

        System.out.println("print object c3:" + c3);
    }
}
