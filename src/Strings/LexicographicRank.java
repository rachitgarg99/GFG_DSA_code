package Strings;

public class LexicographicRank {

    public static int lexiRank(String str){

        int n=str.length();
        int rank=1;
        int[] count =new int[256];
        int mul=fact(n);

        for(int i=0;i<n;i++){
            count[str.charAt(i)]++;
        }

        for(int i=1;i<256;i++){
            count[i]=count[i]+count[i-1];

        }
        for(int i=0;i<n;i++){
            mul=mul/(n-i);
            rank=rank+count[str.charAt(i)-1]*mul;

            for(int j=str.charAt(i);j<256;j++){

                count[j]--;

            }

        }
        return rank;

    }

    static int fact(int n){

        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }


    public static void main(String[] args){

        String st="string";

        System.out.println(lexiRank(st));
    }

}
