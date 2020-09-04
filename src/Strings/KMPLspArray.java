package Strings;

import java.util.Arrays;

public class KMPLspArray {


    public static void EffectiveMethod(String str,int[] lps){

        int n=str.length();
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<n){
            if(str.charAt(i)==str.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }


    }

    public static int properPre(String str,int n){

        for(int len=n-1;len>0;len--){

            boolean flag=true;
            for(int i=0;i<len;i++){
                if(str.charAt(i)!=str.charAt(n-len+i)){
                    flag=false;
                }

            }
            if(flag==true){
                return len;
            }

        }
        return 0;

    }

    public static void naive(String str,int[] lps){

        int n=str.length();

        //int[] lps=new int[n];

        for(int i=0;i<n;i++){
            lps[i]=properPre(str,i+1);

        }

    }

    public static void main(String[] args){

        String str="qgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqbqqqgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqbbqgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqbqqqgqbqgqlqjqgvqgqbqwqgdqgqbqiqgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqbqqqgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqbbqgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqmqgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqbqqqgqbqgqlqjqgvqgqbqwqgdqgqbqgtqgqbqgqlqjqgvqgqbqwqgdqgqbqgqlqjqgvqgqbqqqgqbqgqlqjqgvqgq";

        int n=str.length();

        int[] lps=new int[n];

        int[] lps2=new int[n];

        EffectiveMethod(str,lps);

        System.out.println(Arrays.toString(lps));

        naive(str,lps2);

        System.out.println(Arrays.toString(lps2));


    }

}
