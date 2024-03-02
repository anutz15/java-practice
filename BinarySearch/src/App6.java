public class App6 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int target=12;
        
    }

    // function which will return the coordinates
    static int[] search(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        // we will need another function as we are searching in individiual rows as well
        if(rows==1){
            return BinarySearch(arr, target, 0, cols-1, 0);
        }

        
    }
    static int[] BinarySearch(int[][] arr,int target, int cStart,int cEnd, int row){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;

            if(arr[row][mid]==target) return new int[]{row,mid};
            if(arr[row][mid]<target) cStart=mid+1;
            else cEnd=mid-1;
        }
        // if element not found
        return new int[]{-1,-1};
    }
}
