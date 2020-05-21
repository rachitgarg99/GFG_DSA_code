package Searching.BinarySearch;

public class count1s {

    public static int count1(int[] arr,int n){

        int l=0,h=n-1,mid=0;
        if(arr[h]==1) {

            int last=h;
            int first=0;

            while (l <= h) {

                mid = l + (h - l)/2;

                if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] != 1)) {
                     first=mid;
                     break;
                } else if (arr[mid] == 1) {
                    h = mid - 1;

                } else {
                    l = mid + 1;
                }
            }
           return last-first+1;
        }
        return -1;

    }

    public static void main(String[] args){

        int ar[]={0,0,0,1};
        System.out.println(count1(ar,4));


    }

}
