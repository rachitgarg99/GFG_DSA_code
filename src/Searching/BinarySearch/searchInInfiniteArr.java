package Searching.BinarySearch;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class searchInInfiniteArr {

    public static int findPos(int[] arr,int x) {
        if (arr[0] == x)
            return 0;

        int i = 1;
        while (arr[i] < x) {
            i *= 2;
        }
        if (arr[i] == x)
            return i;
        else
            return binarySearch(arr, i / 2, i, x);


    }
    public static int binarySearch(int[] arr,int l,int h,int x){
        int mid=0;
        while(l<=h){
            mid=l+(h-l)/2;

            if(arr[mid]==x){
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


    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());

        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=Integer.parseInt(st.nextToken());
        }

        int ele=Integer.parseInt(br.readLine());
        System.out.println(findPos(ar,ele));




    }
}
