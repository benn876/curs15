package org.fasttrackit.code.recursion;

import java.util.HashMap;
import java.util.Map;

public class RecursivityExercisesMain {
    private static Long counter = 0L;
    public static Map<Long, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        // print all numbers from n to 0 using recursivity
        //printRecursivityNumbers(10);

        // sum of all numbers from n to 1
        //System.out.println(sumRecurisivityNumbers(10));

        //sirul lui fibonacci  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
        //fib(6) -> fib(5) + fin(4)
        //fib(5) -> fib(4) + fib(3)
        //fib(4) -> fib(3) + fib(2)
        //fib(3) -> fib(2) + fib(1)
        //fib(2) -> fib(1) + fib(0)

        //afiseaza al 22-lea numar din sir

        System.out.println(fibonacci(5));
        System.out.println(fibonacciCache(7));
        System.out.println(counter);
    }

    private static long fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static long fibonacciCache(long n) {
        counter++;
        if (n == 1 || n == 0) {
            return 1;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long firstResult = fibonacciCache(n - 1);
        long secondResult = fibonacciCache(n - 2);
        long result = firstResult + secondResult;
        cache.put(n, result);
        return result;
        // n = 5-> fib(4) + fib(3)
        // n =4 -> fib(3) + fib(2)
        // n = 3 -> fib(2) + fib(1)
        // n =2 -> fib(1) + fib(0)
        // n = 1 -> 1
        // n = 0 -> 1
        // n = 3 -> fib( 2 )+ fib(1)
        // n = 2 -> fib(1) + fib(0)
        // n = 1 -> 1
        // n = 0 -> 1
    }

    private static int sumRecurisivityNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecurisivityNumbers(n - 1);
        // n + sumRecurisivityNumbers(n - 1)
        // n + ( n - 1 ) + sumRecurisivityNumbers(n - 2)
        // n + ( n - 1 ) + (n - 2) + sumRecurisivityNumbers(n - 3)
        //......
        // n + ( n - 1 ) + (n - 2) + ... + sumRecurisivityNumbers(1)
        // n + ( n - 1 ) + (n - 2) + ...  + 2 + 1
    }

    private static void printRecursivityNumbers(int n) {
        if (n == -1) {
            return;
        }
        printRecursivityNumbers(n - 1);
        System.out.println(n);
    }
}
