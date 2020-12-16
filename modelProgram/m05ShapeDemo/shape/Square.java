package shape;

public class Square {
    int a;
    public Square(int x) {
        a = x;
    }
    public int area() {
        return a*a;
    }
    public int perimeter() {
        return 4*a;
    }
}
