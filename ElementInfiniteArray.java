public class ElementInfiniteArray{
    public static void main(String [] args){
        //assume array is sorted and infinite and we have to find the position of a target element. we will not use length function.
        int [] infArr = {1,4,7,10,14,15,18,20,24,34,35,65,69,90,100};
        int target = 20;
        System.out.println(ansInRange(infArr,target));
    }
    static int ansInRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start =  newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if (arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
