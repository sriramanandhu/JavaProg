package series;

public class Fibonacci {
    int n = 10;
    public void fibonacciSeries() {
        int a = 1, b = 1, c;
        System.out.println("Fibonacci series ");

        System.out.print(a+" "+b+" ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
