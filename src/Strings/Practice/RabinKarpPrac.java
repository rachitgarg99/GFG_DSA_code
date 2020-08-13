package Strings.Practice;

public class RabinKarpPrac {

     static final int d=256;

    public static void patternSearch(String txt,String pat,int q){

        int n=txt.length();

        int m=pat.length();

        int h=1;
        for(int i=1;i<m;i++){
            h=(h*d)%q;
        }

        int p=0;
        int t=0;
        for(int i=0;i<m;i++){

            p= (p*d + pat.charAt(i))%q;
            t= (t*d + txt.charAt(i))%q;
        }

        for(int i=0;i<=n-m;i++) {

            if (p == t) {
                boolean flag = true;
                for(int j=0;j<m;j++){
                    if(txt.charAt(i+j)!=pat.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.print(i+" ");
                }
            }
            if(i<n-m){
                t=(d*(t - txt.charAt(i)*h)+txt.charAt(i+m))%q;
                if(t<0)
                       t=t+q;
            }
        }

    }

    public static void main(String[] args){

        String txt="GEEKS FOR GEEKS";
        String pat="GEE";

        patternSearch(txt,pat,101);
    }

}
