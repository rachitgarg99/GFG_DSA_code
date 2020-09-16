package Stack;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaInHistogram {

    public static void main(String[] args){

        int[] arr={6,2,5,4,1,5,6};
        int n=arr.length;
        int[] ps=new int[n];
        int[] ns=new int[n];

        Stack<Integer> st=new Stack<Integer>();

        for(int i=0;i<n;i++){
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
                ps[i]=-1;
            }
            else{
                ps[i]=st.peek();
                st.push(i);
            }
        }

        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
                ns[i]=7;
            }
            else{
                ns[i]=st.peek();
                st.push(i);
            }
        }

        int res=0;
        for(int i=0;i<n;i++){

            int curr=arr[i]+(i-ps[i]-1)*arr[i]+(ns[i]-i-1)*arr[i];
            res=Math.max(curr,res);

        }
        System.out.println(res);

    }
}
