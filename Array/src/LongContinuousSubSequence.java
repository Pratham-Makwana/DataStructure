/**
 * Given an unsorted array of integer nums,
 * return the length of the longest continuous
 * increasing subsequence (i.e sub-array).
 * The subsequence must be strictly increasing
 *
 *
 * nums = [1,3,5,4,7]
 * ans = 3
 * largest sub-array in the longest continuous increasing is 1,3,5
 */
public class LongContinuousSubSequence {

    public  int findLengthOfLCIS(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        int globalMax = 1;
        int localMax = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i - 1]){
                localMax++;
            }else {
                globalMax = Math.max(globalMax,localMax);
                localMax = 1;
            }
        }
        globalMax = Math.max(globalMax,localMax);
        return globalMax;
    }

}
