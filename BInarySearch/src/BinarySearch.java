public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //int[] arr ={1,3,5,9,12};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //Find the element middle
            // int mid = star + end / 2 ;  // might be possible that (start + end) exceeds the rage of the int
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end  = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else
                // found the ans
                return mid;
        }
        return -1;
    }
}
