package Searching;

public class MajorityElement {


    static int majElement(int[] arr,int n){

        int res=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                res=i;
                count=1;
            }
        }

        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }

        }
        if(count<=n/2){
            return -1;
        }
        return arr[res];
    }

    public static void main (String[] args) {
        int arr[] = new int[]{2,8,2,8 ,3, 7, 8,8,8};
        int n = arr.length;
        int sum = 14;

        System.out.println(majElement(arr, n));

    }

}
