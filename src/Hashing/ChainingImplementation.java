package Hashing;


import java.util.Iterator;
import java.util.LinkedList;

public class ChainingImplementation {

    public static void main(String[] args){



    }

}


class myHash1{

    int bucket;

    LinkedList<Integer>[] table;

    myHash1(int b){
        bucket=b;
        table=new LinkedList[bucket];
    }

    myHash1(){
        bucket=7;
        table=new LinkedList[bucket];
    }

    int hash(int key){
        return (key%bucket);
    }

    boolean search(int key){
        int i=hash(key);
        Iterator<Integer> iterator=table[i].iterator();
        while (iterator.hasNext()){
            if(iterator.next()==key){
                return true;
            }
        }
        return false;
    }

    boolean insert(int key){

        int h=hash(key);
        Iterator<Integer> iterator=table[h].iterator();

        while(iterator.hasNext()){
            if(iterator.next()==key){
                return false;
            }

        }
        table[h].add(key);
        return true;
    }

    boolean remove(int key){

        int h=hash(key);
        Iterator<Integer> iterator =table[h].iterator();
        while(iterator.hasNext()){
            if(iterator.next()==key){
                table[h].remove(key);
                return true;
            }
        }
        return false;
    }


}
