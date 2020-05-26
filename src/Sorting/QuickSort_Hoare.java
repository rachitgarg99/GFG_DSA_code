package Sorting;

import java.util.Arrays;

public class QuickSort_Hoare {

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

    public static void main(String[] args){

        int[] arr={11,3,30,5,377,200,2,99};

        qSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

}
