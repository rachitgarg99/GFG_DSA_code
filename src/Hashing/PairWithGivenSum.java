package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean hashFindPair(int[] arr,int sum){


        int n=arr.length;

        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<n;i++){
            if(hs.contains(sum-arr[i])){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;

    }

    public static void main(String[] args){


        int[] arr={10,5,7,9,2,1,6};
        int sum=25;

        if(hashFindPair(arr,sum))
            System.out.println("Yes");

        else
            System.out.println("No");

    }
}
