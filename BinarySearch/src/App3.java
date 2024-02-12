public class App3 {
    public static void main(String[] args) {
        // to find ceiling of a number from a given sorted array
        // int[] arr={2,3,5,9,14,16,18};
        int[] arr={18,16,14,9,5,3,2};
        int target=15;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr, int target){
        int start=0, end=arr.length-1;
        if(arr.length==0) return -1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(isAsc){
                if(arr[mid]<target) start=mid+1;
                else end=mid-1;
            }else{
                if(arr[mid]<target) end=mid-1;
                else start=mid+1;
            }
        }
        return isAsc?start:end;
        
    }
}
