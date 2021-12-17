package chapterEighteen;

import static chapterEighteen.FibonacciSeries.fibonacciNumber;

public class FibonacciSeriesMain {
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 100;

        fibonacciCache = new long[n + 1];
        for (int i = 0; i <= 40; i++) {
            System.out.printf("fibonacciNumber of %d is: %d%n", i, fibonacciNumber(i));
        }
        System.out.println(fibonacciNumber(n));
    }
}
