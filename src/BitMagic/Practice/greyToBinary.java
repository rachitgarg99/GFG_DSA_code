package BitMagic.Practice;


// { Driver Code Starts
//Initial Template for Java

import java.io.*;
        import java.util.*;


// } Driver Code Ends


//User function Template for Java

class BitWise{

    // function to conver given N Gray to Binary

    public static int anotherMethod(int n){
        int b=0;
        for(n=n;n>0;n=n>>1)
            b^=n;

        return b;
    }


    public static int grayToBinary(int n) {

        // Your code here

        if(n==0)
            return 0;
        // Your code here

        int grey[]=new int[40];
        int bin[]=new int[40];
        int ind=0;
        while(n>0){

            grey[ind++]=n%2;

            n/=2;
        }

        int mul=1;
        bin[ind]=grey[ind];
        for(int i=ind-1;i>=0;i--){

            bin[i]=bin[i+1]^grey[i];


        }
        int i=0;
        int ans=0;
        while(i<=ind){

            ans=ans+bin[i]*mul;
            mul*=2;
            i++;
        }

        return ans;

    }

}



// { Driver Code Starts.

class greyToBinary {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            BitWise obj = new BitWise();

            System.out.println(obj.grayToBinary(n));
        }
    }
}
// } Driver Code Ends