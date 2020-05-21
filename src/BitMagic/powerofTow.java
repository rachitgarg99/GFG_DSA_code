package BitMagic;

public class powerofTow{

    static boolean powerBool(int n){

        return (n!=0)&&((n&(n-1))==0);


    }

    public static void main(String[] args){

        if(powerBool(1)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
