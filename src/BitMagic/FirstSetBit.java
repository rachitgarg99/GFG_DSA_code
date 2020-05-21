package BitMagic;

public class FirstSetBit {

    public static int FirstBit(int n){

        for(int i=0;i<n;i++){
            if((n&(1<<i))!=0){
                //System.out.println(i+1);
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args){

        System.out.println(FirstBit(0));
    }

}
