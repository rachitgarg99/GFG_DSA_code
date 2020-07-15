package BitMagic.Practice;

public class SwapAllOddAndEvenBits {

    public static int swapBits(int x){

        int m=x & 0xAAAAAAAA;
        int n=x & 0x55555555;

        return m|n;

    }
}
