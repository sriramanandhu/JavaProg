package shape;

public class Cylinder {
    double r, h, pi = 3.141592;
    public Cylinder(double radius, double height) {
        r = radius;
        h = height;
    }
    public double volume() {
        return pi*r*r*h;
    }
}