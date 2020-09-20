package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class MinMaxOper {

    Deque<Integer> dq;

    MinMaxOper()
    {
        dq=new LinkedList<>();
    }
    void insertMin(int d){
        dq.offerFirst(d);
    }
    void insertMax(int d){
        dq.offerLast(d);
    }
    int getMin(){
        return dq.peekFirst();
    }
    int getMax(){
        return dq.peekLast();
    }
    int extractMin(){
        return dq.removeFirst();
    }
    int extractMax(){
        return dq.removeLast();
    }

    public static void main(String[] args){

        MinMaxOper dd=new MinMaxOper();



    }
}
