package Matrix.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddingToMatrix {

    public static void sumMatrix(int n1,int m1,int n2,int m2,int[][] arr1,int[][] arr2){

        if(n1!=n2 || m1!=m2){

            System.out.println("-1");

        }
        else{

            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    System.out.print((arr1[i][j]+arr2[i][j])+" ");
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        int n1=Integer.parseInt(st.nextToken()),m1=Integer.parseInt(st.nextToken());

        StringTokenizer st2=new StringTokenizer(br.readLine());

        int[][] mat1=new int[n1][m1];

        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                mat1[i][j]=Integer.parseInt(st2.nextToken());
            }
        }

        StringTokenizer st3=new StringTokenizer(br.readLine());

        int n2=Integer.parseInt(st3.nextToken()),m2=Integer.parseInt(st3.nextToken());

        StringTokenizer st4=new StringTokenizer(br.readLine());

        int[][] mat2=new int[n2][m2];

        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                mat2[i][j]=Integer.parseInt(st4.nextToken());
            }
        }

        sumMatrix(n1,m1,n2,m2,mat1,mat2);

    }

}
