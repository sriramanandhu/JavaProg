import java.io.*; 
import java.util.*;

abstract class Shape{
    int side1; 
    int side2;
    void printArea(){}
}

class Rectangle extends Shape{
    Scanner scan = new Scanner(System.in);
    void getRectangle(){
        System.out.print("Enter length and breadth of a rectangle: "); 
        side1 = scan.nextInt();
        side2 = scan.nextInt();
    }
    void printArea(){
        System.out.println("Area of rectangle: " + (side1*side2));
    }
}

class Triangle extends Shape{
    Scanner scan = new Scanner(System.in); 
    void getTriangle(){
        System.out.print("Enter length and height of a triangle: "); 
        side1 = scan.nextInt();
        side2 = scan.nextInt();
    }
    void printArea(){
        System.out.println("Area of rectangle: " + (0.5*side1*side2));
    }
}

class Circle extends Shape{
    Scanner scan = new Scanner(System.in); 
    void getCircle(){
        System.out.print("Enter the radius of a circle: ");
        side1 = scan.nextInt();
    }
    void printArea(){
        System.out.println("Area of circle: " + (3.14*side1*side1));
    }
}

class AbstractDemo{
    public static void main(String[] args){ 
        Rectangle r1 = new Rectangle(); 
        r1.getRectangle(); 
        r1.printArea();
        Triangle t1 = new Triangle(); 
        t1.getTriangle(); 
        t1.printArea();
        Circle c1 = new Circle(); 
        c1.getCircle(); 
        c1.printArea();
    }
}