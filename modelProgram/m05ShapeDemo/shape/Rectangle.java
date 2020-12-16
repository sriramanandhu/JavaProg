package shape;

public class Rectangle {
    int a, b;
    public Rectangle(int x, int y) {
        a = x;
        b = y;
    }
    public int area() {
        return a*b;
    }
    public int perimeter() {
        return 2*(a+b);
    }
}
