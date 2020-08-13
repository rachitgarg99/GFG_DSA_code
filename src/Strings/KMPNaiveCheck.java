package Strings;

public class KMPNaiveCheck {

    public static int longPropPreSuffix(String str,int n){

        for(int len=n-1;len>0;len--){

            boolean flag=true;
            for(int i=0;i<len;i++){
                if(str.charAt(i)!=str.charAt(n-len+i))
                    flag=false;
            }
            if(flag==true){
                return len;
            }

        }
        return 0;
    }
    static void fillLps(String str){

        int[] lps = new int[str.length()];

        for(int i=0;i<str.length();i++){
            lps[i]=longPropPreSuffix(str,i+1);
            System.out.println(lps[i]);
        }

    }

    public static void main(String[] args){

        String str="ababacab";

        fillLps(str);
    }

}
