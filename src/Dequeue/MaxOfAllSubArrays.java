package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxOfAllSubArrays {

    public static void printMaxOfAllSub(int[] arr,int k){
        int n=arr.length;
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.offerLast(i);
        }
        for(int i=k;i<n;i++){
            System.out.println(arr[dq.peekFirst()]);
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peekFirst()]);

    }

    public static void main(String[] args){

        int[] arr={20,40,30,10,60};
        printMaxOfAllSub(arr,3);

    }

}
