package Sorting;

public class UnionOf2SortedArrays {

    public static void union(int[] a,int[] b,int m,int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                System.out.print(a[i++]+" ");
            }
            else if(a[i]>b[j]){
                System.out.print(b[j++]+" ");
            }
            else{
                System.out.print(a[i++]+" ");
                j++;
            }

        }
        while(i<m){
            System.out.print(a[i++]+" ");
        }
        while(j<n){
            System.out.print(b[j++]+" ");
        }
    }
    public static void main(String[] args){
        int[] x={2,4,5,77,200};
        int[] y={5,7,26,77,300,500};
        union(x,y,x.length,y.length);
        //System.out.println(Arrays.toString(res));
    }
}
