package BitMagic.Practice;
// { Driver Code Starts
import java.util.*;


// } Driver Code Ends


//User function Template for Java

//Back-end complete function Template for Java

class Gray{

    public static int betterWay(int n){

        int res=n>>1;
        res=n^res;
        return res;
    }

    //  Function to find the gray code of given number N
    public static int greyConverter(int n) {

        // Your code here

        if(n==0){
            return 0;
        }
        int bin[]= new int[40];
        int grey[]=new int[40];
        int index=0;
        while(n>0){

            bin[index++]=n%2;
            n/=2;

        }

        grey[index]=bin[index];

        for(int i=index-1;i>=0;i--){

            grey[i]=bin[i]^bin[i+1];

        }
        int ans=0;
        int mul=1;
        int i=0;
        while(i<=index){

            ans=ans+grey[i]*mul;

            mul*=2;
            i++;

        }


        return ans;

    }

}



// { Driver Code Starts.

class BinaryToGray {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            Gray obj = new Gray();

            System.out.println(obj.greyConverter(n));

            System.out.println(obj.betterWay(n));
        }
    }
}


// } Driver Code Ends