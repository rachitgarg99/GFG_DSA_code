package LinkedList;

import java.util.HashSet;

class LList5{

    class Node{
        int data;
        Node next;

        Node(){

        }

        Node(int d){
            data=d;
        }
    }
    Node head;

    public void insertEnd(int d){

        Node temp=new Node(d);
        if(head==null){
            head=temp;
            return;
        }

        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;


    }

    public void display(){

        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public void makeLoop(){
        Node curr=head;
        Node temp=head.next;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }

    public boolean check1(){

        Node temp=new Node();
        Node curr=head;
        while(curr!=null){
            if(curr.next==null){
                return false;
            }
            if(curr.next==temp){
                return true;
            }
            Node curr_next=curr.next;
            curr.next=temp;
            curr=curr_next;
        }
        return false;

    }

    boolean check2(){
        HashSet<Node> hsN=new HashSet<Node>();
        Node curr=head;
        while(curr!=null){
            if(hsN.contains(curr)){
                return true;
            }
            else {
                hsN.add(curr);
                curr=curr.next;
            }
        }
        return false;
    }

    boolean check3(){
        Node fast_p=head;
        Node slow_p=head;
        while(fast_p!=null && fast_p.next!=null){
            fast_p=fast_p.next.next;
            slow_p=slow_p.next;
            if(fast_p==slow_p){
                return true;
            }
        }
        return false;
    }



}

public class DetectLoop {

    public static void main(String[] args){


        LList5 l=new LList5();
        l.insertEnd(5);
        l.insertEnd(10);
        l.insertEnd(12);
        l.insertEnd(15);
        l.display();
        l.makeLoop();
        System.out.println(l.check3());

    }
}
