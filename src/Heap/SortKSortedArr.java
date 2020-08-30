package Heap;

import java.util.*;
import java.io.*;

public class SortKSortedArr {

    public int[] sort(int[] arr, int k){

        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

       for(int i=0;i<=k;i++){
            pq.add(arr[i]);

       }

       int index=0;

       for(int i=k+1;i<arr.length;i++){

           arr[index++]=pq.poll();
           pq.add(arr[i]);

       }

       while(pq.isEmpty()==false){
           arr[index++]=pq.poll();
       }
        return arr;

    }

    public static void main(String[] args){

        int[] arr={9,8,7,19,18};

        int k=2;

        SortKSortedArr obj=new SortKSortedArr();

        System.out.println(Arrays.toString(obj.sort(arr,k)));


    }


}
