package Strings;


public class ReverseWordsInString {

    public static void reverseWords(char[] str){

        int len=str.length;

        int start=0;

        for(int end=0;end<len;end++){

            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }

        }

        reverse(str,start,len-1);
        reverse(str,0,len-1);
    }



    public static void reverse(char[] str, int low, int high){

        while(low<high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            low++;
            high--;
        }

    }

    public static void main(String[] args){

        String str="yes no maybe";

        char[] s=str.toCharArray();

        reverseWords(s);

        str= new String(s);

        System.out.println(str);
    }

}
