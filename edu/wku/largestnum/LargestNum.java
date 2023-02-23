package edu.wku.largestnum;

public class LargestNum {
    public static int findLargestNum(int[] nums) {
        if (nums.length == 0) return -1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) if (nums[i] > max) max = nums[i];
        return max;
    }
}
