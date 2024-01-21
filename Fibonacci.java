/**
* This Program is deisgned to calculate the 9th term in the fibonacci sequence and print the results.
    */
public class Fibonacci {
    /**
    *   The main method for our Fibonacci Program
    * @Param  args ( not relevant )
    */ 
    public static void main(String[] args) {
        int n = 10; 
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci term is: " + result);
    }

    /**
    * Math equation for our fibonacci calculation
    * @param variable to select which fibonacci term will be found
    * @return nth term in the Fibonacci sequence
    */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
