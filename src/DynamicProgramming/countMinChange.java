package DynamicProgramming;

public class countMinChange {

    public static long minNoOfCoins(int coins[],int n,int V){

        if(V==0){
            return 0;
        }

        long res=Long.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if (coins[i] <= V) {

                long sub_res=minNoOfCoins(coins,n,V-coins[i]);

                if(sub_res!=Long.MAX_VALUE && sub_res+1<res){
                    res=sub_res+1;
                }

            }
        }

        return res;
    }


    public static long tMinNoOfCoins(int[] coins,int m,int v){

        long[] numberOfCoinsFor =new long[v+1];

        numberOfCoinsFor[0]=0;

        for(int i=1;i<=v;i++){
            numberOfCoinsFor[i]=Long.MAX_VALUE;
        }

        for(int i=1;i<=v;i++){

            for(int j=0;j<m;j++){

                if(coins[j]<=i) {
                    long sub_res = numberOfCoinsFor[i - coins[j]];
                    if (sub_res != Long.MAX_VALUE && sub_res + 1 < numberOfCoinsFor[i]) {
                        numberOfCoinsFor[i] = sub_res + 1;
                    }
                }
            }
        }

        if(numberOfCoinsFor[v]==Long.MAX_VALUE)
            return -1;


        return numberOfCoinsFor[v];
    }



    public static void main(String[] args){

        int[] coins={2 ,5 ,3 ,6};
        int n=coins.length;
        int v=1;
        System.out.println(minNoOfCoins(coins,n,v));

        System.out.println(tMinNoOfCoins(coins,n,v));
    }



}
