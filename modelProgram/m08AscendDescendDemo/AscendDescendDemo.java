// 8. Create a thread named NumberSet to generate a set of random numbers. create a 
// thread AscendThread which uses the NumberSet thread to arrange the numbers in 
// ascending order. create another thread DescendThread that also uses the NumberSet 
// thread to arrange the numbers in descending order generated by the NumberSet thread. 
// Write a driver class to demonstrate the multithreading program.

import java.util.Random;

class NumberSet extends Thread {
    Random rand = new Random();
    int size = 10, bound = 100, val;
    int numSet[] = new int[size];

    @Override
    public void run() {
        System.out.print("The "+size+" random numbers are { ");
        for (int i = 0; i < numSet.length; i++) {
            val = rand.nextInt(bound);
            numSet[i] = val;
            System.out.print(val+" ");
        }
        System.out.println("}");

        Runnable r1 = new AscendThread(numSet);
        Thread t1 = new Thread(r1);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        Runnable r2 = new DescendThread(numSet);
        Thread t2 = new Thread(r2);
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}

class AscendThread implements Runnable {
    int numArr[], temp;
    AscendThread(int[] arr) {
        numArr = arr;
    }
    @Override
    public void run() {
        // System.out.println("Ascend");
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                    temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }

        System.out.println("Elements in Ascending order: ");
        for (int i : numArr) {
            System.out.print(i+" ");
        }
    }
}

class DescendThread implements Runnable {
    int numArr[], temp;
    DescendThread(int[] arr) {
        numArr = arr;
    }
    @Override
    public void run() {
        // System.out.println("Descend");
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] > numArr[j]) {
                    temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }

        System.out.println("Elements in Descending order: ");
        for (int i : numArr) {
            System.out.print(i+" ");
        }
    }
}

public class AscendDescendDemo {
    public static void main(String[] args) {
        NumberSet ns = new NumberSet();
        ns.start();
    }
}
