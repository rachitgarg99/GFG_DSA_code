package LinkedList;

class LList{

     class Node{

        int data;
        Node next;

        Node(int d){
            data=d;
        }
    }


    Node head;
    void insertBegin(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
    }

    void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
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

    //public class Implementation {

    public static void main(String[] args){

        LList l=new LList();

        l.insertBegin(15);
        l.insertBegin(5);
        l.insertBegin(20);
        l.insertEnd(55);
        l.printList();
    }

}

