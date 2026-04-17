package DP;

import java.util.Arrays;

// public class Fibonacci {
    
//     static int counter = 0;

//     public static int fib(int n){
//         counter++;
//         if(n==0 || n==1){
//             return n;
//         }
//         return fib(n - 1) + fib(n - 2);
//     }


// }

//  using memoization

public class Fibonacci {
    static int counter = 0;
    static Integer[] memo = new Integer[100];

    public static int fib(int n){
        counter++;
        if(memo[n] != null){
            return memo[n];
        }
        if(n==0 || n==1){
            return n;
        }
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n=40;

        System.out.println("Fib:"+fib(n));

        System.out.println("Counter: "+counter);
        // System.out.println(Arrays.toString(memo));
    }
}