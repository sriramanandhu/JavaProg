// 6. Create an interface named Series with two methods printFibonacci() 
// and printPrime(). Develop a java program to create a class by implementing 
// the Series interface to print first 10 values of fibonacci series and prime numbers

interface Series {
    void printFibonacci();
    void printPrime();
}

public class SeriesDemo implements Series {
    int count = 20;
    @Override
    public void printFibonacci() {
        System.out.println("Fibonacci series:");
        // int count = 10;
        int a = 1, b = 1, c;
        System.out.print(a+" "+b+" ");
        for (int i = 3; i <= count; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
    @Override
    public void printPrime() {
        System.out.println("\nPrime series:");
        // int count = 10;
        for (int i = 1, n = 1; i <= count; ) {
            if (isPrime(n)) {
                System.out.print(n+" ");
                i++;
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        SeriesDemo sd = new SeriesDemo();
        sd.printFibonacci();
        sd.printPrime();
    }
}