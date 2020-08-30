package Heap;

import java.util.PriorityQueue;

public class PurchasingMaximumItem {

    public static int maxItemsPurchased(int[] arr, int price){

        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

        for(int i=0;i<arr.length;i++){

            pq.add(arr[i]);

        }
        int items=0;

        while(pq.peek()<=price){

            items++;
            price-=pq.poll();

        }
        return items;
    }

    public static void main(String[] args){

        int[] arr={1,12,5,111,200};

        int sum=10;

        System.out.println(maxItemsPurchased(arr,sum));

    }
}
