/* 13. Create a package named series with two classes Fibonacci and Prime 
with a method to generate first 10 numbers for the series. Develop a 
java program to perform the above operation by importing the package. */
import series.Fibonacci;
import series.Prime;

public class SeriesDemo {
    public static void main(String[] args) {
        Fibonacci fib1 = new Fibonacci();
        fib1.fibonacciSeries();

        Prime p1 = new Prime();
        p1.primeSeries();
    }
}
