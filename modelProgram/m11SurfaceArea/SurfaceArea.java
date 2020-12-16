// 11. Create a class Circle with radius as member and perimeter() as method to find the perimeter 
// of a circle. Derive two classes Cylinder and Cone from the Circle class with height and slanting 
// height as members respectively and surfaceArea() as method to find the surface area of respective 
// shape which utilizes the Circle class perimeter() method. Develop a class with main() method to 
// demonstrate the inheritance. (Cylinder surface area: perimeter*height, Cone surface area: 1/2*perimeter*slanting height)

class Circle {
    double r;
    Circle(double radius) {
        r = radius;
    }
    double perimeter() {
        return 2*Math.PI*r;
    }
}

class Cylinder extends Circle {
    double h;
    Cylinder(double radius, double height) {
        super(radius);
        h = height;
    }
    double surfaceArea() {
        return super.perimeter()*h;
    }
}

class Cone extends Circle {
    double sh;
    Cone(double radius, double slantingHeight) {
        super(radius);
        sh = slantingHeight;
    }
    double surfaceArea() {
        return super.perimeter()*sh/2;
    }
}

public class SurfaceArea {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Cylinder cy1 = new Cylinder(3, 5);
        Cone co1 = new Cone(3, 5);
        System.out.println(c1.perimeter());
        System.out.println(cy1.surfaceArea());
        System.out.println(co1.surfaceArea());
    }
}
