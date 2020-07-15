package BitMagic;

public class CountSetBits {

    static int[] table=new int[256];

    static int method0(int n){

        int res=0;

        while(n>0){
            if(n%2!=0){
                res++;
            }
            n/=2;
        }
    return res;
    }

    static int method1(int n){
        int res=0;
        while(n>0){
            if((n&1)!=0){
                res++;
            }
            n=n>>1;
        }
        return res;
    }

    static int method2(int n){
        int res=0;
        while(n>0){
            res++;
            n=n&(n-1);
        }
        return res;
    }

// Method 3 in BigO(1)

    static void initialize(){
        table[0]=0;
        for(int i=1;i<256;i++){
            table[i]=(i&1)+table[i/2];
        }
    }

    static int count(int n){
        int res=table[n & 0xff];
        n=n>>8;
        res+=table[n & 0xff];
        n=n>>8;
        res+=table[n & 0xff];
        n=n>>8;
        res+=table[n & 0xff];
        return res;
    }


    public static void main(String[] args){
        initialize();
        System.out.println(method0(14));
        System.out.println(method1(14));
        System.out.println(method2(14));
        System.out.println(count(14));
    }
}
