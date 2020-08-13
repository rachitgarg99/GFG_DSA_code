import java.io.*;
import java.util.StringTokenizer;

class code {


    public static int maxGold(int P,int Q, int n,int[] alien,int[] gold){



        int count=n;
        int resGold=0;
        int chance=0;
        while(count>0) {

            if(chance%2==0) {
                int j=0;
                while(j<n) {
                    if(j>0) {
                        break;
                    }
                    j++;
                }
                int maxi=0;
                if(alien[j]<=Q && alien[j]<=P) {
                    maxi = gold[j];
                    int k=j+1;
                    while(alien[k]<=0){
                        k++;
                    }
                    if (alien[k] <= Q && alien[k] <= P ) {
                        if (maxi < gold[k]) {
                            resGold += gold[k];
                            alien[k]-=P;
                            count--;
                            chance++;
                            continue;
                        }

                    }
                    else {
                        resGold += maxi;
                        alien[j]-=P;
                        count--;
                        chance++;
                        continue;
                    }
                }



                int i = 0;



                int max = 0;

                int alienNo = n + 1;
                while (i < n) {

                    if (alien[i] <= P && alien[i]> 0) {
                        if (gold[i] > max) {
                            max = gold[i];
                            alienNo = i;
                        }
                    }
                    i++;

                }

                if (alienNo != n + 1) {
                    alien[alienNo]-=P ;
                    resGold += max;
                    count--;
                    chance++;
                    continue;
                }

                else{

                    

                    int l=0;
                    int maxVal=0;
                    int t=l;
                    while(l<n){

                        if(alien[l]<=0){
                            l++;
                            continue;
                        }
                        if(alien[l]>maxVal){
                            maxVal=alien[l];
                            t=l;

                        }
                        l++;


                    }

                    alien[t]-=P;
                    chance++;
                    continue;
                }

            }
            else{

                int j=0;

                while(j<n){

                    if(alien[j]<=0){
                        j++;
                    }
                    else{
                        break;

                    }

                }

                alien[j]-=Q;
                chance++;
                if(alien[j]>0){
                    continue;
                }
                else{
                    count--;
                    continue;
                }


            }


        }
        return resGold;

    }

    public static void main(String[] args) throws Exception {
        //String input = null;

        // read input from stdin
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        int P=Integer.valueOf(st.nextToken());
        int Q=Integer.valueOf(st.nextToken());
        int n=Integer.valueOf(st.nextToken());

        int alien[]=new int[n];
        int gold[]=new int[n];
        int t=n;
        int i=0;
        while(t-->0){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            alien[i]=Integer.valueOf(st1.nextToken());
            gold[i]=Integer.valueOf(st1.nextToken());
            i++;
        }

        System.out.println(maxGold( P,Q, n, alien, gold));

        // write output to stdin
        //System.out.println(input);
    }
}
