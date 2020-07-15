package Matrix.Practice;

public class Sum_of_Upper_and_lower_triangles {

    static void Summatrix(int[][] mat, int n)
    {
        //Your code here
        int c=n;
        int sum1=0;
        for(int i=0;i<n;i++){
            for(int j=c-1;j>=0;j--){
                sum1+=mat[i][j];
            }
            c--;
        }
        int sum2=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                sum2+=mat[i][j];
            }
            c--;
        }

        System.out.println(sum1+" "+sum2);

    }
}
