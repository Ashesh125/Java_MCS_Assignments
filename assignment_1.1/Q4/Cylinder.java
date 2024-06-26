public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Volume calculation
    public double getVolume() {
        return super.getArea() * height;
    }
}
