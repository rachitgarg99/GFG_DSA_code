package Stack;

import java.util.Stack;

public class BetterLargestAreaInHistogram {

    public static void main(String[] args){

        int[] arr={10,5,20,2};
        int n=arr.length;

        Stack<Integer> st=new Stack<Integer>();
        int res=0;
        for(int i=0;i<n;i++){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){

                int top=st.pop();
                int cur=arr[top]*(st.isEmpty()?i:(i-st.peek()-1));
                res=Math.max(cur,res);

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int top=st.pop();
            int cur=arr[top]*(st.isEmpty()? n:(n-st.peek()-1));
            res=Math.max(cur,res);
        }

        System.out.println(res);

    }
}
