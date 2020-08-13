package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

    //Naive solution same as zero Sum

    public static boolean hashFunc(int[] arr,int sum){

        int prefixSum=0;
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<n;i++){

            prefixSum+=arr[i];
            if(hs.contains(prefixSum-sum))
                return true;
            if(hs.contains(sum))
                return true;

            hs.add(prefixSum);
        }

        return false;

    }

    public static void main(String[] args){

        int[] arr={5,8,6,13,3,-1};

        int sum=22;

        if(hashFunc(arr,sum))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
