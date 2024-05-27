package assignment_2.Q1;

public class Circle {
    private double radius = 1.0;
    public String color = "red";
    private static double pi = Math.PI;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        String text = "Circle[radius=" + radius;
        return (this.color != null) ? text + ", color =" + color + "]" : text + "]";
    }
}
