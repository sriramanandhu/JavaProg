/* 22. Create a thread named NumberThread to generate a random number. If the generated 
number is even create a thread SumThread which generate a set of random numbers and 
find the sum of all numbers. If the generated number is odd create another AvgThread 
that generate a set of random numbers and find the average of all numbers. Write a 
driver class to demonstrate the multithreading program. */

import java.util.*;

class NumberThread extends Thread {
    Random rand = new Random();
    int numArr[];
    int val;

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scan.nextInt();
        numArr = new int[n];

        for (int i = 0; i < n; i++) {
            val = rand.nextInt(100);
            numArr[i] = val;
            System.out.println("Random number is: " + val);
            if (val % 2 == 0) {
                Runnable r1 = new SumThread(numArr);
                Thread t1 = new Thread(r1);
                t1.start();
                try {
                    t1.join();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            else {
                Runnable r2 = new AvgThread(numArr);
                Thread t2 = new Thread(r2);
                t2.start();
                try {
                    t2.join();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

class SumThread implements Runnable {
    int numArr[], total;
    SumThread(int[] arr) {
        numArr = arr;
    }
    @Override
    public void run() {
        total = 0;
        for (int i : numArr) {
            total += i;
        }
        System.out.println("The Sum is "+total);
    }
}

class AvgThread implements Runnable {
    int numArr[], total;
    AvgThread(int[] arr) {
        numArr = arr;
    }
    @Override
    public void run() {
        total = 0;
        for (int i : numArr) {
            total += i;
        }
        int average = total/numArr.length;
        System.out.println("The Average value is "+average);
    }
}

public class SumAvgDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        NumberThread nt = new NumberThread();
        nt.start();
    }
}
