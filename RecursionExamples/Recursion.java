import java.util.HashMap;
import java.util.Map;

/**
 * Recursion
 */
public class Recursion {

    // fib number : fib value
    public static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("");

        // traverseIteravely(new int[]{1, 2, 3, 4, 5});
        // traverseRecursivley(new int[]{1, 2, 3, 4, 5}, 0);

        // System.out.println("factorial(5) is: " + factorial(5));

        System.out.println("fib(5) is: " + fib(7));

    }


    public static void traverseIteravely(int[] data) {   
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }    
    }

    public static void traverseRecursivley(int[] data, int index) {
        if (index == data.length) {
            return;
        }

        System.out.println(data[index]);

        traverseRecursivley(data, index + 1);
        
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        int f1;
        int f2;

        if (cache.containsKey(n - 1)) {
            f1 = cache.get(n - 1);
        } else {
            f1 = fib(n - 1);
            cache.put(n - 1, f1);
        }

        if (cache.containsKey(n - 2)) {
            f2 = cache.get(n - 2);
        } else {
            f2 = fib(n - 2);
            cache.put(n - 2, f2);
        }
        return f1 + f2;
    }
}