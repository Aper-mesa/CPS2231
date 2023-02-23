package edu.wku.smallestposnum;

public class SmallestPosNum {
    public static int smallestPosNum(int[] nums) {
        int min = -1;
        for (int num : nums) {
            if (num > 0) {
                min = num;
                break;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] < min) min = nums[i];
        }
        return Math.max(min, 0);
    }
}
