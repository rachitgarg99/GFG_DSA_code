package Stack;


import java.util.Arrays;
import java.util.Stack;

public class largestRectangleWithAllOne {

    public static int longestHist(int[] hist){
        int n=hist.length;
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(int i=0;i<n;i++){

            while(!st.isEmpty() && hist[st.peek()]>=hist[i]){
                int tp=st.pop();
                int cur=hist[tp]*(st.isEmpty()?i:(i-st.peek()-1));
                res=Math.max(cur,res);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int tp=st.pop();
            int cur=hist[tp]*(st.isEmpty()?n:(n-st.peek()-1));
            res=Math.max(res,cur);
        }
        return res;
    }

    public static int MaxRectangle(int[][] mat){
        int r=mat.length;
        int c=mat[0].length;
        int res=longestHist(mat[0]);
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    mat[i][j]+=mat[i-1][j];
                }

            }
            res=Math.max(res,longestHist(mat[i]));
        }
        return res;

    }

    public static void main(String[] args){

        int[][] mat={{1,0,0,1,1},{0,0,0,1,1},{1,1,1,1,1},{0,1,1,1,1}};

        System.out.println(MaxRectangle(mat));

    }

}
