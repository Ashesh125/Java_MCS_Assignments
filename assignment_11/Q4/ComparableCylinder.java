public class ComparableCylinder extends Cylinder implements Comparable<GeometricObject> {
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    public int compareTo(Cylinder o) {
        if (this.getVolume() < o.getVolume()) {
            return -1;
        } else if (this.getVolume() > o.getVolume()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Static method to find the maximum of two ComparableCylinder objects
    public static ComparableCylinder max(ComparableCylinder obj1, ComparableCylinder obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }
}