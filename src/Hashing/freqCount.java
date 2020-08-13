package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class freqCount {


    static void naiveSol(int[] arr,int n){
       // int res=0;
        for(int i=0;i<n;i++){

            boolean flag=false;
            for(int j=i-1;j>=0;j--){

                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }

            }

            if(flag==true)
                continue;

            int freq=1;
            for(int k=i+1;k<n;k++){
                if(arr[i]==arr[k]) {
                    freq++;


                }
            }

            System.out.println(arr[i]+" --> "+freq);
        }
    }

    static void countFreq(int[] arr,int n){

        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){

            if(mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
                mp.put(arr[i],1);

        }
        // var is like auto in c++ which automatically detects the type of datatype, This may not work in some older
        // versions of java
        for(var x: mp.entrySet()){
            System.out.println(x);
        }

        mp.entrySet().stream().forEach(e->{
            System.out.println(e.getKey()+" -----> "+e.getValue());
        });


        for(Map.Entry<Integer,Integer> map:mp.entrySet()){

            System.out.println(map.getKey()+"==="+map.getValue());
        }

        


    }

    public static void main(String[] args){

        int[] arr={10,5,10,15,15,15,20,5,10};

        naiveSol(arr,arr.length);

        System.out.println("\n\n");

        countFreq(arr,arr.length);

    }
}
