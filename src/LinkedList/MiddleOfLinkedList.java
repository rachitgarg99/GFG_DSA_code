package LinkedList;

class LList1{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    };

    void printList(){
        LList1.Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
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

    void middleElement(){

        if(head==null){
            return;
        }
        Node slow=head,fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println(slow.data);
    }
}



public class MiddleOfLinkedList {





    public static void main(String[] args) {

        LList1 l = new LList1();

        l.insertEnd(15);
        l.insertEnd(5);
        l.insertEnd(20);
        l.insertEnd(55);
        l.insertEnd(5);
        l.insertEnd(99);
        l.insertEnd(57);
        l.printList();
        l.middleElement();
    }
}


