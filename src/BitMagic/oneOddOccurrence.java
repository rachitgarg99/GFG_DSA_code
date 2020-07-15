package BitMagic;

public class oneOddOccurrence {

    public static int oddOccurrence(int[] arr){

        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] a={5,2,2,7,5,5,5,9,7};

        System.out.println(oddOccurrence(a));
    }

}
