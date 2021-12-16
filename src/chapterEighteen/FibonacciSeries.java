package chapterEighteen;

import static chapterEighteen.FibonacciSeries.fibonacciNumber;

public class FibonacciSeries {
    private static long[] fibonacciCache;

    public static long fibonacciNumber(int n){
        if(n<= 1){
            return n;
        }
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }
        long fibonacciMemo = (fibonacciNumber(n-1) + fibonacciNumber(n-2));
        fibonacciCache[n] = fibonacciMemo;
        return fibonacciMemo;
    }
    public static void main(String[] args) {
        int n = 100;

        fibonacciCache = new long[n + 1];
        for (int i = 0; i <= 40; i++) {
            System.out.printf("fibonacciNumber of %d is: %d%n", i, fibonacciNumber(i));
        }
        System.out.println(fibonacciNumber(n));
    }
}
