package Strings;

import java.util.*;

public class leftCharRep {

    public static int leftRep(String str1){

        int[] count =new int[256];

        Arrays.fill(count,0);

        int n=str1.length();

        for(int i=0;i<n;i++){

            count[str1.charAt(i)]++;

            if(count[str1.charAt(i)]>1){
                return str1.charAt(i);
            }

        }

        return Integer.MAX_VALUE;

    }

    public static void main(String[] args){

        String str="Geksfor";

        int res=leftRep(str);

        if(res==Integer.MAX_VALUE){
            System.out.println("No");
        }
        else
            System.out.println((char)res);
    }
}
