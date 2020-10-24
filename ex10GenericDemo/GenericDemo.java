import java.io.*;
import java.util.*;

class Number {
    public <T extends Comparable<T>> T max(T num1, T num2) {
        if (num1.compareTo(num2) > 0) {
            return num1;
        } else {
            return num2;
        }
    }
}

class GenericDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter two int values: ");
        Integer i1 = scan.nextInt();
        Integer i2 = scan.nextInt();
        Number n1 = new Number();
        Integer imax = n1.<Integer>max(i1, i2);
        System.out.println("Max of " + i1 + " and " + i2 + " is: " + imax);
        
        System.out.print("Enter two double values: ");
        Double d1 = scan.nextDouble();
        Double d2 = scan.nextDouble();
        Double dmax = n1.<Double>max(d1, d2);
        System.out.println("Max of " + d1 + " and " + d2 + " is: " + dmax);
        
        System.out.print("Enter two characters: ");
        Character c1 = scan.next().charAt(0);
        Character c2 = scan.next().charAt(0);
        Character cmax = n1.<Character>max(c1, c2);
        System.out.println("Max of " + c1 + " and " + c2 + " is: " + cmax);
    }
}