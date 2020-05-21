package Searching.BinarySearch;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {

    static int recBinarySearch(int[] arr,int l,int h,int x){

        if(l>h){
            return -1;
        }
        int mid=l+(h-l)/2;

        if(arr[mid]==x){

            return mid;
        }
        if(arr[mid]>x){
           return recBinarySearch(arr,l,mid-1,x);

        }
        else{
            return recBinarySearch(arr,mid+1,h,x);
        }



    }


    public static void main(String[] args) throws IOException{
//        FileReader fr = new FileReader("C:\\Users\\rachi\\IdeaProjects\\GFG_DSA_code\\src\\file.txt");
//        BufferedReader br=new BufferedReader(fr);


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the value of n for the number of elements in a sorted array");


        System.out.println("Enter the value of n for the number of elements in a sorted array: ");
        int n=Integer.parseInt(br.readLine());

        System.out.println("Enter the elements: ");
        int arr[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){

            arr[i]=Integer.parseInt(st.nextToken());

        }
        System.out.println("Enter the number to find:");
        int ele= Integer.parseInt(br.readLine());
        System.out.println("Element is present at index number: "+recBinarySearch(arr,0,n-1,ele));



    }

}
