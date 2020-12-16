package shape;

public class Cone {
    double r, h, pi = 3.141592;
    public Cone(double radius, double height) {
        r = radius;
        h = height;
    }
    public double volume() {
        return pi*r*r*h/3;
    }
}