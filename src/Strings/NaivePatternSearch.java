package Strings;

public class NaivePatternSearch {

    public static void search(String txt,String pattern){

        int n=txt.length();
        int m=pattern.length();

        for(int i=0;i<n-m+1;i++){
            int j;
            for(j=0;j<m;j++){

                if(txt.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }

            }
            if(j==m)
                System.out.print(i+" ");
        }

    }


    public static void main(String[] args){

        String txt="abcdefghijkl";
        String pattern="jkl";

        search(txt,pattern);

    }
}
