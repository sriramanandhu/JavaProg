// 4. Create a thread named NumberSet to generate a set of random numbers. create 
// a thread SumThread which uses the NumberSet thread to find the sum of all numbers. 
// create another thread MaxThread that also uses the NumberSet thread to find the 
// largest among the numbers generated by the NumberSet thread. Write a driver class 
// to demonstrate the multithreading program.
// import java.io.*;
import java.util.Random;

class NumberSet extends Thread {
    Random rand = new Random();
    int val, size = 10;
    int numSet[] = new int[size];

    @Override
    public void run() {
        System.out.print("The "+size+" random numbers are {");
        for (int i = 0; i < numSet.length; i++) {
            val = rand.nextInt(100);
            numSet[i] = val;
            System.out.print(" "+val);
        }
        System.out.println("}");
        
        Runnable r1 = new SumThread(numSet);
        Thread t1 = new Thread(r1);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        Runnable r2 = new MaxThread(numSet);
        Thread t2 = new Thread(r2);
        t2.start();
        try {
            t2.join();
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

class MaxThread implements Runnable {
    int numArr[], maxVal;
    MaxThread(int[] arr) {
        numArr = arr;
    }
    @Override
    public void run() {
        maxVal = numArr[0];
        for (int i : numArr) {
            if (i > maxVal)
                maxVal = i;
        }
        System.out.println("The Maximum value is "+maxVal);
    }
}

public class SumMaxDemo {
    public static void main(String[] args) {
        NumberSet ns = new NumberSet();
        ns.start();
    }
}