/* Create a package named calculate with three classes Addition, 
Subtraction and Multiplication with a method to performing addition, 
subtraction and multiplication operation respectively. Develop a 
java program to perform the above operation by importing the package. */

import calculate.Addition;
import calculate.Subtraction;
import calculate.Multiplication;

public class CalculateDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("a = "+ a + " b = " + b);
        int result = Addition.add(a, b);
        System.out.println("add - " + result);

        result = Subtraction.sub(a, b);
        System.out.println("sub - " + result);

        result = Multiplication.mult(a, b);
        System.out.println("mult - " + result);
    }
}
