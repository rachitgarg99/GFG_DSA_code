package BitMagic;

import java.util.Scanner;

public class powerSetUsingBitwise {

    public static void printPowerSet(String str){

        int n=str.length();

        int pow= (int) Math.pow(2,n);

        for(int count=0;count<pow;count++){
            for(int i=0;i<n;i++){

                if((count&(1<<i))!=0){
                    System.out.print(str.charAt(i));
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args){

//        Scanner sc=new Scanner(System.in);

        String s="abc";

        printPowerSet(s);

    }
}
