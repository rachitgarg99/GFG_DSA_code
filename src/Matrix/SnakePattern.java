package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnakePattern {

    public static void printSnake(int mat[][],int r,int c){

        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int j=c-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int r=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());

        int[][] mat=new int[r][c];


        for(int i=0;i<r;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<c;j++){
                mat[i][j]=Integer.parseInt(st.nextToken());
            }

        }
        printSnake(mat,r,c);


    }


}
