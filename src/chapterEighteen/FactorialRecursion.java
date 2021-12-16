package chapterEighteen;

public class FactorialRecursion {

    public static int factorial(int n){
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int n){
        if(n<=1){
            return n;
        }
        return n * recursiveFactorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

        for (int i = 0; i <= n; i++) {
            System.out.printf("Factorial of %d is: %d%n", i, factorial(i));
        }
    }
}
