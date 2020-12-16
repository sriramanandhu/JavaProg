package shape;

public class Circle {
    int r;
    double pi = 3.14;
    public Circle(int x) {
        r = x;
    }
    public double area() {
        return pi*r*r;
    }
    public double circumference() {
        return 2*pi*r;
    }
}
