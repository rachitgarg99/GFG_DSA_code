package Searching.TwoPointerApproach;

public class SortedPairSum {

    static int isPresent(int[] arr,int n,int sum){

        int l=0,h=n-1;

        while(l<=h){

            if(arr[l]+arr[h]==sum){
                System.out.println(l+" "+h);
                return 1;
            }
            else if(arr[l]+arr[h]<sum){

                l++;
            }
            else{
                h++;
            }
        }
        return 0;

    }
    public static void main (String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 11};
        int n = arr.length;
        int sum = 14;

        System.out.println(isPresent(arr, n, sum));

    }


}
