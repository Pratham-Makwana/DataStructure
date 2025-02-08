package BinarySearch;

// search the target element in thr Matrix is sorted in row and column wise
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int cols = matrix.length - 1;

        while (row < matrix.length && cols >= 0 ){
            if(matrix[row][cols] == target){
                return new int[]{row,cols};
            }
            if(matrix[row][cols] < target){ // ignore the entire row
                row ++;
            }else { // matrix[row][cols] > target ignore the  entire column because all element is sorted
                cols --;

            }
        }
        return new int[]{-1,-1};
    }
}
