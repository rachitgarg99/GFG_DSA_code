package Heap;

import java.util.PriorityQueue;

public class SortUsingPriorityQueue {


    public static void main(String[] args){

        int[] arr={10,15,50,4,20};

        PriorityQueue<Integer> sorter=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){

            sorter.add(arr[i]);

        }

        for(int i=0;i<arr.length;i++){
            System.out.println(sorter.poll()+" ");
        }

    }

}
