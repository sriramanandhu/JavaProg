import java.io.*;
import java.util.*;

interface Stack {
    void push(int x);
    void pop();  // int ??
}

class StackADT implements Stack {
    int[] stk = new int[10];
    int size;
    int top = -1;

    StackADT() {} // default constructor
    StackADT(int sz) {  // parameterized constructor
        size = sz;
    }

    public void push(int num) {
        try {
            top++;
            if (top == size) {
                throw new ArrayIndexOutOfBoundsException("Stack overflow");
            } else {
                stk[top] = num;
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            top--;
            ae.printStackTrace();
        }
    }

    public void pop() {
        try {
            if (top == -1) {
                throw new ArrayIndexOutOfBoundsException("Stack underflow");
            }
            else {
                System.out.println(stk[top]);
                top--;
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        }
    }

    // public void print() {
    //     for (int i = 0; i <= top; i++) {
    //         System.out.print(i + " ");
    //     }
    //     System.out.print("\n");
    // }
}

public class StackADTDemo {
    static int inputOption;
    static int inputValue;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of Stack: ");
        int sz = scan.nextInt();
        StackADT intStack = new StackADT(sz);

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter your choose: ");
            inputOption = scan.nextInt();

            if (inputOption == 1) {
                System.out.print("Enter the value: ");
                inputValue = scan.nextInt();

                intStack.push(inputValue);
            }
            else if (inputOption == 2) {
                intStack.pop();
            // } else if (inputOption == 4) {
            //     intStack.print();
            }
            else {  // exit the loop
                break;
            }
        }

    }
}
