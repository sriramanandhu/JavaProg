// 3. Create a class Circle with radius as member and area() as method to find the area of circle. 
// Derive two classes Cylinder and Cone from the Circle class with height as member and volume() 
// as method to find the volume of respective shape which utilizes the Circle class 
// area() method. Develop a class with main() method to demonstrate the inheritance

import java.util.Scanner;

class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double area() {
        double area = (3.14 * radius * radius);
        return area;
    }
}

class Cylinder extends Circle {
    double height;
    Cylinder(double r, double h) {
        super(r);
        height = h;
    }
    double volume() {
        double vol = super.area() * height;
        return vol;
    }
}

class Cone extends Circle {
    double height;
    Cone(double r, double h) {
        super(r);
        height = h;
    }
    double volume() {
        double vol = super.area() * height / 3;
        return vol;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = Double.parseDouble(s.nextLine());
        System.out.print("Enter the height: ");
        double h = Double.parseDouble(s.nextLine());

        Circle c1 = new Circle(r);
        System.out.println("The Area of Circle " + c1.area());

        Cylinder cy1 = new Cylinder(r, h);
        System.out.println("The Volume of Cylinder " + cy1.volume());

        Cone co1 = new Cone(r, h);
        System.out.println("The Volume of Cone " + co1.volume());
    }
}
