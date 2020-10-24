import java.io.*;
import java.util.*;

class NumberThread extends Thread {
    Random rand = new Random();
    int val;

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            val = rand.nextInt(100);
            System.out.println("Random number is: " + val);
            if (val % 2 == 0) {
                Runnable r1 = new SquareThread(val);
                Thread t1 = new Thread(r1);
                t1.start();
                try {
                    t1.join();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            else {
                Runnable r2 = new CubeThread(val);
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

class SquareThread implements Runnable {
    int val;
    SquareThread(int v) {
        val = v;
    }
    public void run() {
        System.out.println("Square of "+val+" is: "+ val*val);
    }
}

class CubeThread implements Runnable {
    int val;
    CubeThread(int v) {
        val = v;
    }
    public void run() {
        System.out.println("Cube of "+val+" is: "+ val*val*val);
    }
}

class MultiThread {
    public static void main(String[] args) {
        NumberThread nt = new NumberThread();
        nt.start();
    }
}