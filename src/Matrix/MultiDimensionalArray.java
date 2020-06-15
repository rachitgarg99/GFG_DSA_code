package Matrix;

public class MultiDimensionalArray {

    public static void main(String[] args){

        int[][] arr={{1,2,3,8,9},{4,5,6}};

        int m=2,n=3;
        int[][] arr2=new int[m][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=10;
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
