package Sorting.Practice;

import java.util.ArrayList;

public class Merge3SortedArrays {

    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        int n1=A.length;
        int n2=B.length;
        int n3=C.length;
        ArrayList<Integer> res=new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i]<=B[j] && A[i]<=C[k]){
                res.add(A[i++]);
            }
            else if(B[j]<A[i] && B[j]<=C[k]){
                res.add(B[j++]);
            }
            else{
                res.add(C[k++]);
            }

        }
        while(i<n1 && j<n2){
            if(A[i]<=B[j]){
                res.add(A[i++]);

            }
            else
                res.add(B[j++]);
        }
        while(j<n2 && k<n3){
            if(B[j]<=C[k])
                res.add(B[j++]);
            else
                res.add(C[k++]);
        }
        while(i<n1 && k<n3){
            if(A[i]<=C[k]){
                res.add(A[i++]);
            }
            else
                res.add(C[k++]);
        }
        while(i<n1)
            res.add(A[i++]);
        while(j<n2)
            res.add(B[j++]);
        while(k<n3)
            res.add(C[k++]);
     return res;
    }

    public static void main(String[] args){

        int A[]={2,4,9,16,35,77};
        int B[]={6,9,11,54,66,97,100};
        int C[]={10,11,12,13,14};

        System.out.println(merge3sorted(A,B,C));

    }

}
