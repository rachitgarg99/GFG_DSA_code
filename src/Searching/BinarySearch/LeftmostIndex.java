package Searching.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeftmostIndex {

    static int leftMostIndex(int[] arr,int low,int high,int x){

        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==x && (mid==0 || arr[mid-1]!=x)){
            return mid;
        }
        if(arr[mid]>=x){
            return leftMostIndex(arr,low,mid-1,x);

        }
        else {
            return leftMostIndex(arr, mid + 1, high, x);
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int ele=Integer.parseInt(br.readLine());
        System.out.println(ele);
        System.out.println("Starting index of element is: "+leftMostIndex(arr,0,n-1,ele));


    }
}
