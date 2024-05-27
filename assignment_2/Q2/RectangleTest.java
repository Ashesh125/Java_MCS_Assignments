package assignment_2.Q2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 10);

        System.out.println(rect1);
        System.out.println("Area of rect1:" + rect1.getArea());
        System.out.println("Perimeter of rect1:" + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();

        System.out.println(rect2);

        rect3.setLength(100);
        rect3.setWidth(10);

        System.out.println(rect3);
        System.out.println("Area of rect1:" + rect3.getArea());
        System.out.println("Perimeter of rect1:" + rect3.getPerimeter());

    }
}
