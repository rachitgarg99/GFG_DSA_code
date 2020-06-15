package Strings;

import java.util.Arrays;

public class IsPermutationOfPatternPresent {

    static void patternPresence(String txt,String pat){

        int[] countP=new int[256];
        int[] countTW=new int[256];
        int np=pat.length();
        int nt=txt.length();

        for(int i=0;i<np;i++){
            countP[pat.charAt(i)]++;
            countTW[txt.charAt(i)]++;
        }

        for(int i=np;i<nt;i++){

            if(Arrays.equals(countP,countTW))
                System.out.println("Yes, at : "+(i-np));

            countTW[txt.charAt(i)]++;

            countTW[txt.charAt(i-np)]--;


        }

        if(Arrays.equals(countP,countTW))
            System.out.println("Yes, at : "+(nt-np));

        System.out.println("No");


    }

    public static void main(String[] args){

        String tx="BACDGABCDA";
        String pt="ABCD";

        patternPresence(tx,pt);

//        if()
//
//        else
//            System.out.println("No");
    }

}
