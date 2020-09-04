package LinkedList;



class LList{

    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
        }
    }

    Node head;

    public void insertBeg(int d){
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }

    public void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            //System.out.println(curr.next);
            curr=curr.next;
        }
    }

    public void insertEnd(int d){
        Node nNode=new Node(d);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=nNode;
    }



}

class Implementation {

    public static void main(String[] args){

        LList l1=new LList();

        l1.insertBeg(10);
        l1.insertBeg(20);
        l1.insertBeg(30);
        l1.insertEnd(66);
        l1.printList();
    }

}