/* 18. Create an interface named CheckNumber with two methods checkPrime() and 
checkArmstrong(). Develop a java program to create a class by implementing 
the CheckNumber interface to check the given value is prime and Armstrong 
Ref: https://www.programiz.com/java-programming/examples/armstrong-number */

import java.util.Scanner;

interface CheckNumber {
    boolean checkPrime(int num);

    boolean checkArmstrong(int num);
}

class Check implements CheckNumber {

    @Override
    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkArmstrong(int num) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;

        for (; originalNumber != 0; originalNumber /= 10, ++n)
            ;

        originalNumber = num;

        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if (result == num)
            return true;
        // else
        return false;
    }

}

public class CheckNumberDemo {
    public static void main(String[] args) {
        Check c1 = new Check();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scan.nextInt();

        if (c1.checkPrime(n)) {
            System.out.println(n+" is prime.");
        } else {
            System.out.println(n+" is not prime.");
        }

        if (c1.checkArmstrong(n)) {
            System.out.println(n+" is an armstrong number.");
        } else {
            System.out.println(n+" is not an armstrong number.");
        }
    }
}
