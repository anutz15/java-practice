public class App2 {
    public static void main(String[] args) {
        // order agnostic binary search-not know from start whether array is sorted or not
        int[] arr={1,2,3,4,5,11,15,20,35,40,41};
        int key=41;
        System.out.println(BinarySearch(arr,key));
    }    

    static int BinarySearch(int[] arr,int key){
        int start=0, end=arr.length-1;

        // boolean isAsc;
        // if(arr[start]<arr[end]) isAsc=true;
        // else isAsc=false;

        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key) return mid;
            if(isAsc){
                if(arr[mid]<key) start=mid+1;
                else end=mid-1;
            }else {
                if(arr[mid]<key) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;   // element not found
    }
}
