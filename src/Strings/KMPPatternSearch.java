package Strings;

public class KMPPatternSearch {


    public static void fillLPS(String pat,int[] lps){

        int n=pat.length();
        int len=0;
        lps[0]=0;

        int i=1;
        while(i<n){

            if(pat.charAt(i)==pat.charAt(len)){
                lps[i]=len+1;
                len++;
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

    public static void KMPSearch(String str,String pat){

        int n=str.length();
        int m=pat.length();
        int[] lps=new int[m];

        fillLPS(pat,lps);

        int i=0,j=0;
        while(i<n){

            if(str.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                System.out.print(i-j+" ");
                j=lps[j-1];
            }
            else if(i<n && pat.charAt(j)!= str.charAt(i)){
                if(j==0){
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }

        }

    }

    public static void main(String[] args){

        String txt="ababaababaabbbbaaabababababbababbbababbbbbababba";
        String pat="ababa";
        KMPSearch(txt,pat);

    }

}
