package Strings;

import java.util.Arrays;

public class leftNotRepeat {

    public static int leftNoRep(String str){

        int n=str.length();

        int[] count=new int[256];

        Arrays.fill(count,0);

        for(int i=0;i<n;i++){

            count[str.charAt(i)]++;
        }

        for(int i=0;i<n;i++){

            if(count[str.charAt(i)]==1)
                return str.charAt(i);
        }

        return Integer.MAX_VALUE;

    }

    public static void main(String[] args){

        String st="GeeksorGeeks";

        int res=leftNoRep(st);

        if(res==Integer.MAX_VALUE)
            System.out.println("No");
        else
            System.out.println((char)res);

    }
}
