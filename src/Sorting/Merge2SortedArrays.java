package Sorting;

import java.util.Arrays;

public class Merge2SortedArrays {

    public static int[] merge(int a[],int b[],int m,int n){

        int arr[]=new int[m+n];
        int i=0;
        int j=0;
        int t=0;
        while(i<m && j<n){

            if(a[i]<b[j])
                arr[t++]=a[i++];
            else
                arr[t++]=b[j++];
        }
        while(i<m)
            arr[t++]=a[i++];
        while(j<n)
            arr[t++]=b[j++];

        return arr;

    }

    public static void main(String[] args){
        int[] x={2,4,5,77,200};
        int[] y={5,7,26,300,500};
        int[] res=merge(x,y,x.length,y.length);
        System.out.println(Arrays.toString(res));
    }

}
