package edu.wku.computemode;

public class ComputeMode {
    public static int mode(int[] nums) {
        int max = 0;
        int count = 1;
        int index = 0;
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) if (nums[j] == nums[i]) count++;
            if (count > max) {
                max = count;
                index = i;
            }
            count = 1;
        }
        return nums[index];
    }
}
