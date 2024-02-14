public class App4 {
    
    // Question-to find index of a number in an infinite length array
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start=0, end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start)*2;
            start=temp;
        }
        // now we got the range where to find the number, call binary search in that range
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr,int target,int start, int end){
        int mid=start+(end-start)/2;
        // if(arr.length==0) return -1;
        while(start<=end){
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}
