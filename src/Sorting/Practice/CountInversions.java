package Sorting.Practice;

import java.util.*;
import java.lang.*;

class CountInversions
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for(long i = 0; i < n; i++)
                arr[(int)i] = sc.nextLong();

            System.out.println(new Inversion_of_Array().inversionCount(arr, n));

            System.out.println(Arrays.toString(arr));

        }
    }
}

class Inversion_of_Array {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    static long countInv(long[] arr,long l,long h){
        long res=0;
        if(l<h){

            long m=l+(h-l)/2;
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,h);
            res+=countAndMerge(arr,l,m,h);
        }

        return res;
    }

    static long countAndMerge(long[] arr,long l,long m,long h){

        int res=0;
        int n1=(int)(m+1-l);
        int n2=(int)(h-m);
        long[] left=new long[ n1];
        long[] right=new long[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[(int)l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[(int)m+1-j];
        }
        int i=0,j=0,k=(int)l;
        while(i<n1 && j<n2){

            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                res+=(n1-i);
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        return res;
    }

    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return countInv(arr,0,N-1);
    }
}

