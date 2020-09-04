package Strings;

import java.util.Scanner;

public class LexicographicRankOfAString {

    static int size=256;

    static int fact(int n){
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }



    static int lexRank(String str){

        int n=str.length();
        int[] count=new int[size];
        int mul=fact(n);

        for(int i=0;i<n;i++){
            count[str.charAt(i)]++;
        }
        for(int i=1;i<size;i++){
            count[i]+=count[i-1];
        }
        int res=1;
        for(int i=0;i<n;i++){
            mul=mul/(n-i);
            res+=count[str.charAt(i)-1]*mul;
            for(int j=str.charAt(i);j<256;j++){
                count[j]--;
            }
        }
        return res;
    }

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        String str= "STRING";

        System.out.println(lexRank(str));

    }

}


