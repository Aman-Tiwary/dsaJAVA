class BinarySearch {
    public static void main(String[] args) {
        int []arrAsc ={1,3,4,6,8,34};
        int []arrDsc ={34,8,6,4,3,1};
        int target = 6;
        System.out.println(binarySearch(arrAsc,target));
        System.out.println(binarySearch(arrDsc,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = (arr[end]>arr[start]);
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else
            {
                 if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
