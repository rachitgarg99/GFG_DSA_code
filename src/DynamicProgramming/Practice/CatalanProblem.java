package DynamicProgramming.Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class CatalanProblem {


    public static BigInteger binomialCoeff(int n, int k){

        BigInteger res=new BigInteger("1");

        if(k>n-k){
            k=n-k;
        }

        for(int i=0;i<k;i++){
            res=res.multiply(BigInteger.valueOf(n-i));
            res=res.divide(BigInteger.valueOf(i+1));

        }
        return res;

    }

    public static BigInteger Catalan(int n){

        BigInteger c=binomialCoeff(2*n,n);

        return c.divide(BigInteger.valueOf(n+1));

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

//        for (int i = 0; i <=n; i++) {
//            System.out.print(Catalan(i) + " ");
//        }
//
        System.out.println(Catalan(n));

    }



}
