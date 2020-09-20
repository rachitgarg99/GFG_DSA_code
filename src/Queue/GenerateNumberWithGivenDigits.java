package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumberWithGivenDigits {

    public static void generateNumbers(String[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        Queue<String> q = new LinkedList<>(Arrays.asList(arr));

        while(q.peek().length()<4){
            String cur=q.remove();
            System.out.print(cur+" ");
            for(int i=0;i<n;i++){
                q.add(cur+arr[i]);
            }
        }


    }

    public static void main(String[] args){

        String[] arr={"A","B"};
        generateNumbers(arr);
    }
}
