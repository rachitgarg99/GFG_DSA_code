package Hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static boolean Naive(int[] arr){

        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            res=0;
            for(int j=i;j<n;j++){
                res+=arr[j];
                if(res==0){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hashFunc(int[] arr){
        int n=arr.length;
        int prefixSum=0;
        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<n;i++){
            prefixSum=prefixSum+arr[i];
            if(hs.contains(prefixSum))
                return true;
            else
                hs.add(prefixSum);
        }
        return false;
    }

    public static void main(String[] args){


        int[] arr={1,4,13,-3,-11,5};

        if(hashFunc(arr))
            System.out.println("Yes");
        else
            System.out.println("No");

        if(Naive(arr))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
