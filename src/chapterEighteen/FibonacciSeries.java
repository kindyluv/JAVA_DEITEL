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
}
