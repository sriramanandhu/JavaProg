/* 21. Create an interface Cylinder with three methods surfaceArea(), totalSurfaceArea(), 
and volume() to find the surface area, total surface area and volume of cylinder 
(S.A=2*pi*r*h, TSA=2*pi*r(h+r) and V=pi*r*r*h). Develop a java application 
to implement the Cylinder interface. */

interface Cylinder {
    void surfaceArea();
    void totalSurfaceArea();
    void volume();
}

class CylinderDemo implements Cylinder {
    double pi = 3.141; // Math.PI
    double r, h;
    double SA, TSA, V;

    // Parameterized Constructor
    CylinderDemo(double radius, double height) {
        r = radius;
        h = height;
    }

    @Override
    public void surfaceArea() {
        SA = (2 * pi * r * h);
        System.out.println("surface area of cylinder: " + SA);
    }

    @Override
    public void totalSurfaceArea() {
        TSA = (2 * pi * r * (h + r));
        System.out.println("totalsurface area of cylinder: " + TSA);
    }

    @Override
    public void volume() {
        V = (pi * r * r * h);
        System.out.println("volume of cylinder: " + V);
    }
}

public class InterfaceCylinderDemo {
    public static void main(String[] args) {
        System.out.println("HelLo !");

        CylinderDemo cy1 = new CylinderDemo(2, 5); // radius, height
        cy1.surfaceArea();
        cy1.totalSurfaceArea();
        cy1.volume();
    }
}
