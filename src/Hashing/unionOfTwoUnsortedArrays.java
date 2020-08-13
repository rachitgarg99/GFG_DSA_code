package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class unionOfTwoUnsortedArrays {


    public static int NaiveUnion(int[] arr1,int[] arr2,int m,int n){

        int[] c=new int[m+n];

        for(int i=0;i<m;i++){
            c[i]=arr1[i];
        }

        for(int i=0;i<n;i++)
            c[m+i]=arr2[i];

        int res=0;
        for(int i=0;i<m+n;i++){
            boolean flag=false;

            for(int j=i-1;j>=0;j--){
                if(c[i]==c[j]){
                    flag=true;
                }
            }
            if(flag==false){
                res++;
            }

        }

        return res;

    }

    public static int HashUnionCount(int[] arr1,int[] arr2,int m,int n){

        HashSet<Integer> hs=new HashSet<Integer>();

        for(int i=0;i<m;i++)
            hs.add(arr1[i]);

        for(int j=0;j<n;j++)
            hs.add(arr2[j]);

        return hs.size();
    }


    public static void main(String[] args){

        int arr1[]={10,15,10,15,17,23,88};
        int arr2[]={10,10,10,50,99,45};

        System.out.println(NaiveUnion(arr1,arr2,arr1.length,arr2.length));

        System.out.println(HashUnionCount(arr1,arr2,arr1.length,arr2.length));

    }

}
