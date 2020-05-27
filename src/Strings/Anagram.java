package Strings;

public class Anagram {

    public static boolean anagram(String str1,String str2){

        int[] count =new int[256];

        if(str1.length()!=str2.length())
            return false;



        for(int i=0;i< str1.length();i++){

            count[str1.charAt(i)]++;
        }

        for(int i=0;i<str2.length();i++){

            count[str2.charAt(i)]--;
        }

        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args){

        String s1="geeks";

        String s2="keges";

        if(anagram(s1,s2))
            System.out.println("Yes");

        else
            System.out.println("No");

    }
}
