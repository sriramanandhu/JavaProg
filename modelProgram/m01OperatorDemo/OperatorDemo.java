// 1. Create a package named calculate with three classes Addition, Subtraction 
// and Multiplication with a method to performing addition, subtraction and 
// multiplication operation respectively. Develop a java program to perform the 
// above operation by importing the package.
import java.util.*;
import operator.Addition;
import operator.Subtraction;
import operator.Multiplication;

class OperatorDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int m = scan.nextInt();
        System.out.print("Enter the second number: ");
        int n = scan.nextInt();

        Addition a1 = new Addition();
        int res = a1.add(m, n);
        System.out.println("add: "+res);

        Subtraction s1 = new Subtraction();
        res = s1.sub(m, n);
        System.out.println("sub: "+res);

        Multiplication m1 = new Multiplication();
        res = m1.mult(m, n);
        System.out.println("mult: "+res);
    }
}
