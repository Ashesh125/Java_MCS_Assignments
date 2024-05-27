public abstract class GeometricObject implements Comparable<GeometricObject> {
    // Abstract method to calculate area
    public abstract double getArea();

    // compareTo method to compare GeometricObjects based on area
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() < o.getArea()) {
            return -1;
        } else if (this.getArea() > o.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Method to find the maximum of two GeometricObjects
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }
}