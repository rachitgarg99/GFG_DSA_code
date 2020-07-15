package BitMagic;

public class countOddNumbers {

    static int oddCount(int[] arr){

        int count=0;

        for(int i=0;i<arr.length;i++) {
            if ((arr[i] & 1) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        int[] a={5,2,7,6,11,3,10};

        System.out.println(oddCount(a));
    }


}
