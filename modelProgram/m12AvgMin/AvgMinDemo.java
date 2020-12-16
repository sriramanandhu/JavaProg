// 12. Create a thread named NumberSet to generate a set of random numbers. create a thread 
// AvgThread which uses the NumberSet thread to find the average of all numbers. create another 
// thread MinThread that also uses the NumberSet thread to find the smallest among the numbers 
// generated by the NumberSet thread. Write a driver class to demonstrate the multithreading program.
import java.util.Random;

class NumberSet extends Thread {
    Random rand = new Random();
    int val, size = 10, bound = 100;
    int numSet[] = new int[size];

    @Override
    public void run() {
        System.out.print("The "+size+" random numbers are [");
        for (int i = 0; i < numSet.length; i++) {
            val = rand.nextInt(bound);
            numSet[i] = val;
            System.out.print(" "+val);
        }
        System.out.println("]");

        Runnable r1 = new AvgThread(numSet);
        Thread t1 = new Thread(r1);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        Runnable r2 = new MinThread(numSet);
        Thread t2 = new Thread(r2);
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
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

class MinThread implements Runnable {
    int numArr[], minVal;
    MinThread(int[] arr) {
        numArr = arr;
    }
    @Override
    public void run() {
        minVal = numArr[0];
        for (int i : numArr) {
            if (i < minVal) {
                minVal = i;
            }
        }
        System.out.println("The Minimum value is "+minVal);
    }
}

public class AvgMinDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        long startTime = System.nanoTime();

        NumberSet ns = new NumberSet();
        ns.start();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Duration :"+(duration));
    }
}
