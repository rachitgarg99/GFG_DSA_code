package Hashing;

import java.util.HashSet;

public class CountDiscreteElements {

    static int countDist(int arr[],int n){

        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }

    return hs.size();
    }

    public static void main(String[] args){

        int[] arr={10,20,10,50,50,10,20,40,20,1001};

        int n=arr.length;

        System.out.println(countDist(arr,n));

    }
}
