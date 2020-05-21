package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MergeSort {

    public static void mergeSort(int[] arr, int l,int h){

        if(h>l){

            int m=l+(h-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,h);
            merge(arr,l,m,h);
        }

    }

    public static void merge(int[] arr,int l, int m,int h){

        int n1=m-l+1;
        int n2=h-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];

        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
