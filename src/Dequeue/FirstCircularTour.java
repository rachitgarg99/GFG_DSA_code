package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class FirstCircularTour {

    // Better Solution but not the best as worst time complexity is still O(2n) and Space Complexity of O(n)
    public static int dequeFirstTour(int[] pet, int[] dist){

        Deque<Integer> dq=new LinkedList<>();
        int p=pet.length;
        int current_petrol=0;
        int count=0,end=0;
        while(true){
            count++;
            current_petrol+=pet[end]-dist[end];
            dq.addLast(end);
            while(!dq.isEmpty() && current_petrol<0){
                int x=dq.removeFirst();
                current_petrol-=(pet[x]-dist[x]);
            }
            end=(end+1)%p;
            if(!dq.isEmpty() && dq.getFirst()==end){
                return dq.getFirst()+1;
            }
            if(count==2*p){
                break;
            }

        }
        return -1;

    }
    // Best Solution where time complexity is O(n) and Space Complexity is O(1)
    public static int BestFirstTour(int[] petrol,int[] dist){

        int curr_Petrol=0;
        int prev_petr=0;
        int start=0;
        int n=petrol.length;
        for(int i=0;i<n;i++){
            curr_Petrol+=petrol[i]-dist[i];
            if(curr_Petrol<0){
                start=i+1;
                prev_petr=curr_Petrol;
                curr_Petrol=0;
            }

        }
        return ((curr_Petrol+prev_petr)>=0)?(start+1):-1;

    }

    public static void main(String[] args){

        int[] petr={4,8,4,12};
        int[] dist={6,9,5,5};

        System.out.println(dequeFirstTour(petr,dist));
        System.out.println(BestFirstTour(petr,dist));

    }

}
