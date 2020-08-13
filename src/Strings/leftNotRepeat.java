package Strings;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class leftNotRepeat {


    public static int Naive(String str){


        for(int i=0;i<str.length();i++){
            boolean flag=false;

            for(int j=i+1;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)){

                    flag=true;

                }


            }
            if(flag==false){
                return i;
            }

        }
        return -1;

    }

    static final int CHAR=256;
    public static int TwoTraversal(String str){

        int[] count=new int[CHAR];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1)
                return i;
        }
        return -1;
    }
    // Best approach for the Leftmost non repeating String char.
    public static int Approach1(String str){

        int[] fIndex=new int[CHAR];

        Arrays.fill(fIndex,-1);

        for(int i=0;i<str.length();i++){

            int fi=(int)str.charAt(i);

            if(fIndex[fi]==-1){
                fIndex[fi]=i;
            }
            else{
                fIndex[fi]=-2;
            }

        }
        int res=Integer.MAX_VALUE;
        for(int j=0;j<256;j++){
            if(fIndex[j]>-1){
                res=Integer.min(res,fIndex[j]);
            }
        }

        if(res==Integer.MAX_VALUE)
            return -1;

        return res;

    }


//
//    public static int leftNoRep(String str){
//
//        int n=str.length();
//
//        int[] count=new int[256];
//
//        Arrays.fill(count,0);
//
//        for(int i=0;i<n;i++){
//
//            count[str.charAt(i)]++;
//        }
//
//        for(int i=0;i<n;i++){
//
//            if(count[str.charAt(i)]==1)
//                return str.charAt(i);
//        }
//
//        return Integer.MAX_VALUE;
//
//    }


    public static void main(String[] args){

        String st="GeeksforGeeks";

//        int res=leftNoRep(st);
//
//        if(res==Integer.MAX_VALUE)
//            System.out.println("No");
//        else
//            System.out.println((char)res);

        System.out.println(Naive(st));

        System.out.println(TwoTraversal(st));

        System.out.println(Approach1(st));

    }
}
