package chapterEighteen;

import static chapterEighteen.FactorialRecursion.factorial;

public class FactorialRecursionMain {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

        for (int i = 0; i <= n; i++) {
            System.out.printf("Factorial of %d is: %d%n", i, factorial(i));
        }
    }
}
