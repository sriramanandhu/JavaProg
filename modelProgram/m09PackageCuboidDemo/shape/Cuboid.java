package shape;

public class Cuboid {
    double l, b, h;
    public Cuboid(double length, double breadth, double height) {
        l = length;
        b = breadth;
        h = height;
    }
    public double volume() {
        return l*b*h;
    }
}
