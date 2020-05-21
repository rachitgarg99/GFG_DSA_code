package Searching.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class countX {

    public static int leftIndex(int[] arr,int n,int x){

        int l=0;
        int h=n-1;
        int mid=0;
        while(l<=h){
            mid=l+(h-l)/2;

            if(arr[mid]==x && (mid==0 || arr[mid-1]!=x)){
                return mid;
            }
            else if(arr[mid]>=x){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

    public static int rightIndex(int[] arr,int n,int x){
        int l=0;
        int h=n-1;
        int mid=0;
        while(l<=h){

            mid=l+(h-l)/2;

            if(arr[mid]==x && (mid==n-1 || arr[mid+1]!=x)){
                return mid;
            }
            else if(arr[mid]>x){
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return -1;
    }


    public static void main(String[] args){
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int arr[]={2,4,5,5,5};
        int start=leftIndex(arr,5,2);
        int end=rightIndex(arr,5,2);

        if(start!=-1)
            System.out.println(end-start+1);
        else
            System.out.println(0);
    }
}
