package Sorting;

import java.util.Arrays;

public class IntersectionOf2SortedArr {

    public static void intersection(int[] a,int[] b,int m,int n){

        int i=0,j=0;

        while(i<m && j<n){

            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;

            else {
                System.out.println(a[i]);
                i++;
                j++;
            }

        }

    }

    public static void main(String[] args){
        int[] x={2,4,5,77,200};
        int[] y={5,7,26,77,300,500};
        intersection(x,y,x.length,y.length);
        //System.out.println(Arrays.toString(res));
    }

}
