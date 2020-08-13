package Strings;

public class DistinctNaivePatternSearch {

    public static void patternSearch(String txt,String pattern) {


        int m=pattern.length();

        int n=txt.length();

        for(int i=0;i<=n-m;){

            int j;

            for(j=0;j<m;j++){

                if(pattern.charAt(j)!=txt.charAt(i+j)){

                    break;

                }

            }

            if(j==m){
                System.out.println(i);
            }

            if(j==0) {
                i++;
            }
            else {
                i = (i + j);
            }
        }

    }

    public static void main(String[] args){

        String txt="HelloHellohjtdfHelloHellasd";

        String pattern="Hell";

        patternSearch(txt,pattern);


    }

}
