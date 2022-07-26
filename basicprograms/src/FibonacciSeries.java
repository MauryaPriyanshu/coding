import java.util.Scanner;

public class FibonacciSeries {
    static int a = 0, b = 1, sum = 0;

    public static void main(String[] agrs) {
        int count = 80;
        System.out.print(a + " " + b);
        fibonacci(count - 2);

    }

    public static void fibonacci(int count) {
        if (count > 0) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
            fibonacci(count - 1);
        }
    }
}
