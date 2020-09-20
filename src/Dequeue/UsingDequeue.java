package Dequeue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class UsingDequeue {

    public static void main(String[] args){



        Deque<Integer> dq=new LinkedList<>();

        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.offerLast(15);

        System.out.println(dq.pollFirst());
        System.out.println(dq.peekLast());
        dq.pollLast();
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        /** In the Above code the functions used on dequeue will not return any error or exception
         *
         */

        dq.addFirst(10);
        dq.addLast(30);
        dq.addFirst(15);
        dq.addLast(7);

        System.out.println(dq.getFirst());
        System.out.println(dq.removeLast());
        dq.removeFirst();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        /** In the Above code the functions used on dequeue may throw exceptions
         *
         */

        // Iterator to Traverse the dequeue

        Iterator it=dq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        // Enhanced for loop for traversal of Dequeue

        for(int x : dq){
            System.out.print(x+" ");
        }

    }
}
