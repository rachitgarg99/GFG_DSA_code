package DynamicProgramming;

import java.util.Scanner;

public class fibonacciMemoization {

//Normal method of recursion.
    static int fib1(int n){
        if(n==0||n==1){

            return n;
        }
        return fib1(n-1)+fib1(n-2);
    }


// Memoization method
    static long[] memo;
    static long fib(int n){

        if(memo[n]==-1){
            long res;
            if(n==0||n==1){
                res=n;
            }
            else {
                res = fib(n - 1) + fib(n - 2);
            }
            memo[n] = res;
        }
        return memo[n];
    }

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        memo=new long[n+1];

        for(int i=0;i<=n;i++){
            memo[i]=-1;
        }

//        for(int i=0;i<n;i++) {
//            System.out.print(fib(i) + " ");
//        }

        System.out.print(fib(n) + " ");
    }
}
