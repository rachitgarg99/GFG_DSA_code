package Matrix;

public class JaggedArray {

    public static void main(String[] args){

        int m=3;
        int[][] arr=new int[3][];

        for(int i=0;i<m;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
