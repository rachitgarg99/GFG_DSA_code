package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeCount {

    //Recursive Problem

    public static int CoinChange(int[] coins,int n,int sum){

        if(sum==0) return 1;

        if(n==0) return 0;

        int res=CoinChange(coins,n-1,sum);
        if(sum>=coins[n-1]){
            res=res+CoinChange(coins,n,sum-coins[n-1]);
        }
        return res;
    }


    //Tabulation DP
    public static int tCoinChange(int[] coins,int sum){
        int n=coins.length;

        int[][] dp=new int[sum+1][n+1];

        for(int i=0;i<=n;i++){
            dp[0][i]=1;
        }

        for(int i=1;i<=sum;i++){
            dp[i][0]=0;
        }

        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if(coins[j-1]<=i){
                    dp[i][j]+=dp[i-coins[j-1]][j];
                }
            }
        }
        return dp[sum][n];
    }


//    public static long minimumNumberOfCoins(int coins[],int numberOfCoins,int value)
//    {
//        // your code here
//
//        int n=numberOfCoins;
//        int m=value;
//
//        long[][] dp=new long[m+1][n+1];
//
//        for(int i=0;i<=n;i++){
//            dp[0][i]=1;
//        }
//        for(int i=1;i<=m;i++){
//            dp[i][0]=0;
//        }
//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++){
//                dp[i][j]=dp[i][j-1];
//                if(coins[j-1]<=i){
//                    dp[i][j]+=dp[i-coins[j-1]][j];
//                }
//            }
//        }
//
//        return dp[m][n];
//    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int coins[]=new int[n];

        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        }
        int sum=sc.nextInt();

        System.out.println(CoinChange(coins,n,sum));

        System.out.println(tCoinChange(coins,sum));

       // System.out.println(minimumNumberOfCoins(coins,n,sum));
    }


}
