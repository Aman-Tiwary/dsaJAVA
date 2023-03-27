public class FloorCeil {
    public static void main(String args[]) {
        int[]arr = {1,3,45,67,69,85};
        int target = 4;
        System.out.println("floor at index:"+floor(arr,target));
        System.out.println("ceil at index:"+ceil(arr,target));
    }
    static int floor(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int ceil(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
