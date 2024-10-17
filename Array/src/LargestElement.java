/*
 https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
 => Largest Element in Array <=

 Given an array, arr. The task is to find the largest element in it.

Examples:

    Input: arr = [1, 8, 7, 56, 90]
    Output: 90
    Explanation: The largest element of the given array is 90.

    Input: arr = [5, 5, 5, 5]
    Output: 5
    Explanation: The largest element of the given array is 5.

    Input: arr = [10]
    Output: 10
    Explanation: There is only one element which is the largest.

 Expected Time Complexity: O(n)
 Expected Space Complexity: O(1)

 Constraints:
 1 <= arr.size()<= 106
 0 <= arr[i] <= 106
*/

class LargestElement {
    public static int largest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        return largest;
    }


    public static void main(String[] args) {
       int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }
}
