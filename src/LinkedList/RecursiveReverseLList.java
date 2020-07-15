package LinkedList;

public class RecursiveReverseLList {

    static class LinkedList {

        Node head;

        class Node {
            int data;
            Node next;

            Node(int d){
                data=d;
            }

        };

        void insertBeg(int x){

            Node temp=new Node(x);
            temp.next=head;
            head=temp;
        }

        void printLList(){

            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.println();

        }

        Node reverseRecursive(Node aaa){

            // Base Condition
            if(aaa==null || aaa.next==null){
                return aaa;
            }

            Node rest_head=reverseRecursive(aaa.next);
            Node rest_tail=aaa.next;
            rest_tail.next=aaa;
            System.out.println(aaa.next+" "+aaa.data);
            aaa.next=null;
            System.out.println(aaa.next);
            return rest_head;

        }
    }

    public static void main(String[] args){

        LinkedList l=new LinkedList();

        l.insertBeg(77);
        l.insertBeg(17);
        l.insertBeg(44);
        l.insertBeg(64);
        l.insertBeg(14);
        l.insertBeg(3);

        l.printLList();
        l.head=l.reverseRecursive(l.head);
        l.printLList();

    }

}
