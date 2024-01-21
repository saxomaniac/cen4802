public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci term is: " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
