package Searching.BinarySearch;

public class findPeak {

    static int findPeakUnit(int arr[],int low,int high,int n){

        int mid=low+(high-low)/2;

        if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid]>=arr[mid+1])){
            return mid;
        }

        else if(mid>0 && arr[mid-1]>=arr[mid]){
            return findPeakUnit(arr,low,mid-1,n);
        }
        else return findPeakUnit(arr,mid+1,high,n);

    }

    static int findPeak1(int[] arr,int n){

        return findPeakUnit(arr,0,n-1,n);
    }
    public static void main (String[] args)
    {
        int arr[] = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of a peak point is " +
                findPeak1(arr, n));
    }
}
