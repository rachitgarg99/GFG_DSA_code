package BitMagic;

public class twoOddOccurrence {

    static void twoOccurrence(int[] arr){

        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }

        int sb=xor&~(xor-1);

        int res1=0,res2=0;
        for(int i=0;i<arr.length;i++){

            if((arr[i]&sb)!=0){
                res1=res1^arr[i];
            }
            else{
                res2=res2^arr[i];
            }
        }

        System.out.println(res1+" "+res2);

    }

    public static void main(String[] args){
        int[] a={5,2,2,7,5,5,5,9,7,11,9,9};
        twoOccurrence(a);

    }

}
