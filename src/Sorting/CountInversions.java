package Sorting;

import java.util.Arrays;

/* Inversions are when

        i<j
        &&
        arr[i]>arr[j]
 */
public class CountInversions {

    public static int countInv(int[] arr,int l,int r){

        int res=0;
        if(r>l){

            int m=l+(r-l)/2;
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,r);
            res+=countAndMerge(arr,l,m,r);
        }
        return res;
    }


    public static int countAndMerge(int[] arr,int l,int m, int r){


        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];

        int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }

        for(int j=0;j<n2;j++){
            right[j]=arr[m+j+1];
        }

        int res=0,i=0,j=0,k=l;

        while(i<n1 && j<n2){

            if(left[i]<right[j]){
                arr[k++]=left[i++];

            }
            else{
                arr[k++]=right[j++];
                res+=n1-i;
            }

        }
        while(i<n1){
            arr[k++]=left[i++];

        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        return res;

    }

    public static void main(String[] args){
        int[] arr={11,3,30,5,377,200,2,99};

        System.out.println(countInv(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(res));
    }
}
