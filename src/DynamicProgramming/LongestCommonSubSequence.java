package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubSequence {


    //Memoization Solution
    static int[][] memo;


    static int lcs(String s1,String s2,int m,int n){

        if(memo[m][n]!=-1){
            return memo[m][n];
        }

        if(m==0 || n==0){
            memo[m][n]=0;
        }
        else{
            if(s1.charAt(m-1)==s2.charAt(n-1)){
                memo[m][n]=1+lcs(s1,s2,m-1,n-1);
            }
            else{
                memo[m][n]=Integer.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
            }
        }
        return memo[m][n];


    }

    // Tabular Solution

    public static int tlcs(String s1,String s2){

        int m=s1.length();
        int n=s2.length();

        int[][] dp=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];

                }
                else{
                    dp[i][j]=Integer.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }


    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();

        int m=s1.length();
        int n=s2.length();

        memo=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                memo[i][j]=-1;
            }
        }

        System.out.println(lcs(s1,s2,m,n));

        System.out.println(tlcs(s1,s2));

    }

}



//        if(memo[m][n]==-1){
//            int res;
//            if(m==0 || n==0){
//                res=0;
//                memo[m][n]=res;
//            }
//            if(s1.charAt(m)==s2.charAt(n)){
//                res= 1+lcs(s1,s2,m-1,n-1);
//            }
//            else{
//                res=Integer.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
//            }
//            memo[m-1][n-1]=res;
//
//        }
//return memo[m-1][n-1];

