package Hashing;

public class LongestSubArrayWithGivenSum {

    public static int NaiveSol(int[] arr,int sum){

        int res=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            int currSum=0;
            for(int j=i;j<n;j++){
                currSum+=arr[j];
                if(currSum==sum){
                    res=Integer.max(res,j-i+1);


                }
            }
        }


        return res;
    }


    


    public static void main(String[] args){

        int[] arr={5,8,2,2,-4,9,-2,2};

        int sum=0;

        System.out.println(NaiveSol(arr,sum));

    }

}
