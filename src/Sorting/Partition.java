package Sorting;

import java.util.Arrays;

public class Partition {

    public static void naivePivot(int[] arr,int l,int h,int p){


        int[] temp=new int[h+l+1];
        int index=0;
        //int x=0;
        for(int i=l;i<=h;i++){

            if(arr[i]<arr[p]){
                temp[index] = arr[i];
                index++;

            }


        }
        temp[index++]=arr[p];

       // System.out.println(Arrays.toString(temp));
       // System.out.println(x);
        for(int j=l;j<=h;j++){

            if(arr[j]>arr[p]){
                temp[index]=arr[j];
                index++;
            }
        }

        for(int k=l;k<=h;k++){
            arr[k]=temp[k-l];
        }
       // System.out.println(Arrays.toString(temp));

    }


    public static void lomutoPartition(int[] arr,int l,int h){

        int i=l-1;
        int temp;
        int pivot=arr[h];
        for(int j=l;j<=h-1;j++){

            if(arr[j]<pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        temp=arr[h];
        arr[h]=arr[i+1];
        arr[i+1]=temp;

        System.out.println( i+1);

    }

    public static int hoarePartition(int[] arr,int l,int h){

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

    public static int hoarePartition2(int[] arr,int l,int h){

        int pivot=arr[l];
        int i=l;
        int j=h;
        while(true){

            while(arr[i]<pivot){
                i=i+1;
            }

            while(arr[j]>pivot){
                j=j-1;
            }

            if(i>=j){
                return j;
            }

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i=i+1;
            j=j-1;
        }

    }



    public static void main(String[] args){
        int[] arr1={11,3,30,5,377,200,2,99};
        int[] arr2={2 ,5 ,3 ,7 ,4};
        int[] arr3={4 ,5 ,3 ,7 ,2};
        int[] arr4={4 ,5 ,3 ,7 ,2};
        naivePivot(arr1,0,arr1.length-1,2);

        System.out.println(Arrays.toString(arr1));

        lomutoPartition(arr2,0,arr2.length-1);

        System.out.println(Arrays.toString(arr2));

        System.out.println(hoarePartition(arr3,0,arr3.length-1));

        System.out.println(Arrays.toString(arr3));

        System.out.println(hoarePartition2(arr4,0,arr4.length-1));

        System.out.println(Arrays.toString(arr4));

    }
}
