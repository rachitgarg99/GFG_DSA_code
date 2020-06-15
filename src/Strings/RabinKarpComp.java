package Strings;

public class RabinKarpComp {
    final static int d=256;

    public static void RBAlog(String pat,String txt,int m,int n,int q){
        int h=1;
        for(int i=1;i<=(m-1);i++){
            h=(h*d)%q;
        }
        int p=0,t=0;
        for(int i=0;i<m;i++){
            p=((d*p)+pat.charAt(i))%q;
            t=((d*t)+txt.charAt(i))%q;

        }
        for(int i=0;i<=n-m;i++){
            if(p==t){
                boolean flag=true;
                for(int j=0;j<m;j++){
                    if(txt.charAt(i+j)!=pat.charAt(j))
                    {
                        flag=false;
                        break;
                    }

                }
                if(flag){
                    System.out.println(i);
                }

            }
            if(i<n-m){
                t=(d*(t - txt.charAt(i)*h) + txt.charAt(i+m))%q;
                if(t<0)
                    t=t+q;
            }
        }
    }

    public static void main(String[] args){

        String txt="GEEKS FOR GEEKS";
        String pat="GEE";

        RBAlog(pat,txt,pat.length(),txt.length(),101);
    }
}
