package Sorting.Practice;

import java.util.*;
class Triplets{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Triplet g=new Triplet();
            if(g.findTriplets(a,n))
                System.out.println("1");
            else
                System.out.println("0");

        }
    }
}// } Driver Code Ends


/*Complete the function below*/


class Triplet
{
    // Function to check if triplet is present
    // arr[]: input array
    // n: size of the array

    static int lpartition(int[] arr,int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
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

    static void qSort(int[] arr,int l,int r){

        if(l<r){
            int p=lpartition(arr,l,r);
            qSort(arr,l,p-1);
            qSort(arr,p+1,r);
        }
    }

    public boolean findTriplets(int[] arr , int n)
    {
        //add code here.
        qSort(arr,0,n-1);

        //System.out.println(Arrays.toString(arr));

        return false;
    }
}