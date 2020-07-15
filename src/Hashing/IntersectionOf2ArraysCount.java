package Hashing;


import java.util.HashSet;

class IntersectionOf2ArraysCount {

    private static int NaiveSol(int[] arr1,int[] arr2,int m,int n){

        int res=0;
        for(int i=0;i<m;i++){
            boolean flag=false;
            for(int j=i-1;j>=0;j--){
                if(arr1[i]==arr1[j])
                {
                    flag=true;
                    break;
                }

            }

            if(flag) {
                continue;
            }
            for(int k=0;k<n;k++){
                if(arr1[i]==arr2[k]){
                    res++;
                    break;
                }
            }


        }

        return res;

    }

    public static int hashIntersection(int[] arr1,int[] arr2,int m,int n){

        HashSet<Integer> s=new HashSet<Integer>();

        for(int i=0;i<m;i++){
            s.add(arr1[i]);
        }
        int res=0;
        for(int j=0;j<n;j++){
            if(s.contains(arr2[j])){
                res++;
                s.remove(arr2[j]);
            }
        }

        return res;



    }


    public static void main(String[] args){

        int[] arr1={10,15,20,15,30,30,5};
        int[] arr2={30,5,30,80};

        System.out.println(NaiveSol(arr1,arr2,arr1.length,arr2.length));

        System.out.println(hashIntersection(arr1,arr2,arr1.length,arr2.length));

    }

}
