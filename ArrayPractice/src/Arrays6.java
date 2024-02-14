// Find equilibrium point in array

import java.util.*;
public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(N);
        for(int i=0; i<N;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        int total_sum=0;
        for(int i=0; i<N; i++){
            total_sum+=list.get(i);
        }
        int cum_sum=0;
        int sumL=0;
        int sumR=0;
        int flag=0;

        for(int i=0; i<N; i++){
            cum_sum+=list.get(i);
            sumL=cum_sum-list.get(i);
            sumR=total_sum-cum_sum;
            if(sumL==sumR){
                System.out.println("index: "+(i+1));
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("NOT FOUND");
        }
        sc.close();
    }
}
