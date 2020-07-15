package DynamicProgramming.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printNFibonacciNums {


    public static void printFibonacci(int n){

        long[] dp=new long[n+1];

        dp[0]=0;

        dp[1]=1;

        System.out.print(dp[1]+" ");


        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            System.out.print(dp[i]+" ");
        }


    }


    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t-->0){

            int n=Integer.parseInt(br.readLine());


            //Tabulation Method
            printFibonacci(n);


            System.out.println();


        }



    }

}
