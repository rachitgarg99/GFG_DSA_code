package Sorting.Practice;


import java.util.*;
import java.lang.*;
import java.io.*;

class KthSmallestElement {

    
    
    static int lomutoPart(int[] arr,int l,int h){

        int i=l-1;
        int pivot=arr[h];
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }

    static int randomPartition(int[] arr,int l,int r){

        int n=r-l+1;
        int pivot=(int)(Math.random())*(n-1);
        int temp=arr[pivot];
        arr[pivot]=arr[r];
        arr[r]=temp;
        return lomutoPart(arr, l, r);
    }

    static int KthSmallest(int[] arr,int l,int r,int k){

        
        if(k>0 && k<=r-l+1){

            int pos=randomPartition(arr, l, r);
            if(pos-l==k-1){
                return arr[pos];
            }
            else if(pos-l>k-1){
                KthSmallest(arr, l, pos-1, k);
            }
            else{
                KthSmallest(arr, pos+1, r, k);
            }


        }
        return -1;
    }
    
	public static void main (String[] args) {
        //code

        Scanner scan =new Scanner(System.in);

        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){

                arr[i]=scan.nextInt();
            }
            int k=scan.nextInt();

            // Random rand = new Random();
            
            // int rnd = rand.nextInt(n-1);
            // int temp=arr[rnd];
            // arr[rnd]=arr[n-1];
            // arr[n-1]=temp;

            System.out.println(KthSmallest(arr, 0,n-1, k));
        }

        

	}
}