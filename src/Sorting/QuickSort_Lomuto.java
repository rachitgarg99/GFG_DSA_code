package Sorting;

import java.util.Arrays;

public class QuickSort_Lomuto {

    public static int partition(int[] arr,int l,int h){

        int pivot=arr[h];
        int temp;
        int i=l-1;
        for(int j=l;j<=h;j++){


            if(arr[j]<pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }


        }


        i++;
        temp=arr[h];
        arr[h]=arr[i];
        arr[i]=temp;

        return i;


    }

    public static void qSort(int[] arr, int l,int h){

        if(l<h){

            int p=partition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }

    public static void main(String[] args){

        int[] arr={11,3,30,5,377,200,2,99};

        qSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }


}
