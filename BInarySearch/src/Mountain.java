// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/

public class Mountain {
    public static void main(String[] args) {

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid =  start + (end - start ) / 2;

            if(arr[mid] > arr[mid + 1]){
                // you are the descending part of the array
                // this may be the ans but look the left side
                // this  is why end != mid-1 because the mid + 1 is already smaller then mid
                end = mid;
            }else {
                // you are in ascending part of the array
                start = mid + 1; // because we know that arr[mid + 1] element > arr[mid] element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}
