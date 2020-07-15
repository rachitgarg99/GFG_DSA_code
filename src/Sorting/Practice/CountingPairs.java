package Sorting.Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. INTEGER k
     */

    public static <T> ArrayList<T> removeDuplicates(List<T> list)
    {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }

    public static int countPairs(List<Integer> newList, int k) {
        // Write your code here

        ArrayList<Integer>
                numbers = removeDuplicates(newList);


        Collections.sort(numbers);

        int count=0;
        int l=0;
        int r=0;

        while(r<numbers.size()){

            if(l>0 && numbers.get(l)==numbers.get(l-1)){
                l++;
                continue;
            }
//            if(r>0 && numbers.get(r)==numbers.get(r-1)){
//                r++;
//                continue;
//            }


            if(numbers.get(r)-numbers.get(l)==k){
                count++;
                l++;
                r++;
            }
            else if(numbers.get(r)-numbers.get(l)>k){
                l++;
            }
            else{
                r++;
            }


        }



        return count;


    }

}

public class CountingPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(br.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return br.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(br.readLine().trim());

        int result = Result.countPairs(numbers, k);

        System.out.println(Arrays.toString(numbers.toArray()));

        System.out.println(result);



        br.close();
        //bufferedWriter.close();
    }
}
