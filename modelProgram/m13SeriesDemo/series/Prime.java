package series;

public class Prime {
    int num = 10;
    public void primeSeries() {
        System.out.println("\nPrime Series ");
        int i = 2, count = 0;
        while (count < num) {
            if (isPrime(i)) {
                System.out.print(i+" ");
                count += 1;
            }
            i += 1;
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
}
