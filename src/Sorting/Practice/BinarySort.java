package Sorting.Practice;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import java.lang.*;




class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int n =Integer.parseInt(st[0]);

            int arr[] = new int[n];
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st[i]);
            new BinarySort().binSort(arr, n);
            for(Integer x: arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class BinarySort
{
    public static int partition(int[] arr,int l,int h){

        int pivot=arr[l];
        int i=l-1;
        int j=h+1;

        while(true){

            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }

    public static void qSort(int[] arr, int l,int h){


        if(l<h){

            int p=partition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);

        }
    }
    static void binSort(int arr[], int n)
    {
        // add your code here


        /**************
         * No need to print the array
         * ************/
        qSort(arr,0,n-1);



    }
}

