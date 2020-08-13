package Strings.Practice;

public class Binary_String {

    public static int Search(String str, int n){

        int number=0;

        for(int i=0;i<n;i++){

            if(str.charAt(i)=='1'){
                number++;
            }

        }

        int res=number*(number-1)/2;
        return res;

    }

    public static void main(String[] args){

        String str="01101";

        System.out.println(Search(str,str.length()));

    }
}
