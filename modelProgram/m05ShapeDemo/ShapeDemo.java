// 5. Create a package named shape with three classes Square, Rectangle 
// and Circle with a method to find the area of the specific shape. Develop 
// a java program to perform the above operation by importing the package.

import shape.Rectangle;
import shape.Square;
import shape.Circle;

public class ShapeDemo {
    public static void main(String[] args) {
        Square s1 = new Square(3);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        Rectangle r1 = new Rectangle(3, 4);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle c1 = new Circle(7);
        System.out.println(c1.area());
        System.out.println(c1.circumference());
    }
}