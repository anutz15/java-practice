public class App4 {
    public static void main(String[] args) {
        // question - max sum of array in 2D array
        int[][] arr={
            {1,2,3},
            {2,3,9},
            {3,4,5}
        };
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max) max=sum;
        }
        System.out.println(max);
    }
}
