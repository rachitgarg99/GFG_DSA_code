package LinkedList;

public class ReverseALinkedList {

    static class LList{
        Node head;


        class Node{
            int data;
            Node next;
            Node(int d){
                data=d;
            }

        }

        void insertEnd(int x) {
            Node temp=new Node(x);
            if (head == null) {
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
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.println();
        }

        Node reverseLList(){

            Node curr=head;
            Node prev=null;
            while (curr!=null){

                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;


            }
            return prev;

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
        l.head=l.reverseLList();
        l.printList();

    }
}
