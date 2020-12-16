// 7. Create a class Circle with radius as member and area() as method to find the 
// area of circle. Derive a class Cylinder from the Circle class with height as member 
// and volume() as method to find the volume of cylinder which utilizes the Circle 
// class area() method. Derive another class from Cylinder class with volume as method 
// to find the volume of cone which utilizes cylinder volume. Develop a class with 
// main() method to demonstrate the inheritance

class Circle {
    double r, pi = 3.141592;
    Circle(double radius) {
        r = radius;
    }
    double area() {
        return pi*r*r;
    }
}

class Cylinder extends Circle {
    double h;
    Cylinder(double radius, double height) {
        super(radius);
        h = height;
    }
    double volume() {
        return area()*h;
    }
}

class Cone extends Cylinder {
    Cone(double radius, double height) {
        super(radius, height);
    }
    @Override
    double volume() {
        return super.volume()/3;
    }
}

public class CircleInheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Cylinder cy1 = new Cylinder(7, 7);
        Cone co1 = new Cone(7, 7);
        System.out.println(c1.area());
        System.out.println(cy1.volume());
        System.out.println(co1.volume());
    }
}
