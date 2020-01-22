package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(findFibonacciNonRecursively(7));
    }

    public static int findFibonacciNonRecursively(int index) {
        int prev = 0;
        int fib = 1;
        if (index == 0) return prev;

        for (int i = 1; i < index; i++) {
            int temp = prev;
            prev = fib;
            fib = temp + prev;
        }
        return fib;
    }

    public static int findFibonacciRecursively(int index) {
        return (index <= 1) ? index : findFibonacciRecursively(index - 1) + findFibonacciRecursively(index - 2);
    }
}
