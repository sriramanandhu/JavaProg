/* 20. Create a package numbers with two classes OddNumbers and EvenNumbers with two 
methods for the each class to generate random numbers and display the random 
numbers. Include another method for each class to print only odd values and even 
values respectively. Develop a java application to demonstrate the usage of package */

package numbers;

import java.util.*;

public class OddNumber {
    int arr[];
    int n;
    Random rand = new Random();
    Scanner s = new Scanner(System.in);

    // Create random numbers
    public void generateNumbers() {
        System.out.print("\nEnter the range: ");
        n = s.nextInt();
        arr = new int[n];

        for (int i = 1; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
    }

    // Print the numbers
    public void printNumbers() {
        System.out.print("The random numbers:  ");
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Print the odd numbers
    public void printOddNumbers() {
        System.out.print("Odd numbers:  ");
        for (int i = 1; i < n; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
