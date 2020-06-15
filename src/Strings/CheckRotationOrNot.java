package Strings;

public class CheckRotationOrNot {

    public static boolean check(String s1,String s2){

        if(s1.length()!=s2.length())
            return false;

        s1+=s1;

        if(s1.contains(s2))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String str1="lohel";
        String str2="helloe";
        if(check(str1,str2)){
            System.out.print("Yes");

        }
        else{
            System.out.print("No");
        }

    }
}
