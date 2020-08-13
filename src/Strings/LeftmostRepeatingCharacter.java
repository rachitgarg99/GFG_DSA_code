package Strings;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {

    public static int findNaive(String str){

        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j))
                    return i;

            }
        }
        return -1;

    }

    static final int CHAR=256;

    public static int findBetter(String str){

        int[] count=new int[CHAR];

        for(int i=0;i<str.length();i++){

            count[str.charAt(i)]++;

        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1)
                return i;
        }

        return -1;
    }

    public static int findApproach1(String str){

        int[] fIndex=new int[CHAR];

        Arrays.fill(fIndex,-1);

        int res=Integer.MAX_VALUE;

        for(int i=0;i<str.length();i++){

            if(fIndex[str.charAt(i)]==-1){

               fIndex[str.charAt(i)]=i;

            }
            else{
                res=Integer.min(res,fIndex[str.charAt(i)]);
            }

        }

        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }

    public static int findApproach2(String str){

        boolean[] visited=new boolean[CHAR];

        int res=-1;

        for(int i=str.length()-1;i>=0;i--){

            if(visited[str.charAt(i)]){

                res=i;

            }
            else{
                visited[str.charAt(i)]=true;
            }
        }
        return res;

    }

    public static void main(String[] args){

        String st="abcbc";

        System.out.println(findNaive(st));

        System.out.println(findBetter(st));

        System.out.println(findApproach1(st));

        System.out.println(findApproach2(st));

    }

}
