package Hashing;

public class OpenAddressingImplementation {



}


class myHash2{

    int[] arr;
    int siz;
    int cap;
    myHash2(int c){
        cap=c;
        siz=0;
        arr=new int[cap];
    }

    int hash(int key){
        return (key%cap);
    }

    boolean search(int key){
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                return true;
            }
            i=(i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }

    boolean insert(int key){

        if(siz==cap)
            return false;

        int i=hash(key);

        while(arr[i]!=-1 && arr[i]==-2 && arr[i]!=key){
            i=(i+1)%cap;
        }
        if(arr[i]==key){
            return false;
        }
        else{
            arr[i]=key;
            siz++;
            return true;
        }
    }

    boolean remove(int key){

        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
             if(arr[i]==key){
                 arr[i]=-2;
                 siz--;
                 return true;
             }
             i=(i+1)%cap;
             if(i==h)
                 return false;

        }
        return false;
    }

}