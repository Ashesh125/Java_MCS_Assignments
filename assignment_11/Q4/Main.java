public class Main {
    public static void main(String[] args) {
        // Testing GeometricObject max method with circles
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Circle maxCircle = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println("Max circle area: " + maxCircle.getArea());

        // Testing GeometricObject max method with cylinders
        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(2, 8);
        Cylinder maxCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
        System.out.println("Max cylinder volume: " + ((Cylinder) maxCylinder).getVolume());

        // Testing ComparableCylinder max method
        ComparableCylinder compCylinder1 = new ComparableCylinder(3, 5);
        ComparableCylinder compCylinder2 = new ComparableCylinder(2, 8);
        ComparableCylinder maxCompCylinder = ComparableCylinder.max(compCylinder1, compCylinder2);
        System.out.println("Max comparable cylinder volume: " + maxCompCylinder.getVolume());

        // Testing howToColor method
        Square square = new Square();
        square.howToColor();
    }
}
