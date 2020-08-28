package lesson11;

/**
 * Main.
 *
 * @author Aleksandr_Dvortsov
 */
public class Fib {

    public static void main(String[] args) {
        System.out.println(fib2(47));
        System.out.println(fib1(47));
    }

    public static long fib1(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    public static long fib2(int n) {
        long f1 = 1;
        long f2 = 1;
        long i = 0;
        while (i < n - 2) {
            long sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            i = i + 1;
        }
        return f2;
    }

}
