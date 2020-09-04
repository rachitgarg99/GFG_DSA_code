package LinkedList;

import java.awt.desktop.SystemEventListener;

public class nThNodeFromEnd {

    static class LList{
        Node head;

        class Node{
            int data;
            Node next;
            Node(int d){
                data=d;
            }
        }

        void insertEnd(int x){
            Node temp=new Node(x);
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

        void printList(){

            Node curr=head;
            while(curr.next!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.println();
        }

        void printNthEnd(int p){

            if(head==null){
                return;
            }

            Node first=head;
            Node second=head;
            for(int i=0;i<p;i++){
                if(first.next==null) return;
                first=first.next;
            }

            while(first.next!=null){
                second=second.next;
                first=first.next;
            }

            System.out.println(second.data);

        }

        /** Effective Method designed by me by the help of the above strategy */

        void printNthElement(int n){
            if(head==null){
                return;
            }
            Node first=head;
            Node second = null;
            int count=0;
            while(first!=null){

                if(count==n){
                    second=head;
                }
                if(count>n){
                    if(second!=null) {
                        second = second.next;
                    }
                    else{
                        return;
                    }
                }
                count++;
                first=first.next;
            }
            assert second != null;
            System.out.println(second.data);

        }


    }
    public static void main(String[] args){

        LList l=new LList();

        l.insertEnd(11);
        l.insertEnd(7);
        l.insertEnd(110);
        l.insertEnd(70);
        l.insertEnd(91);
        l.insertEnd(40);
        l.printList();
        l.printNthEnd(4);
        l.printNthElement(2);
        l.printNthElement(4);


    }



}
