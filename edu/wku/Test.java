package edu.wku;

import edu.wku.computemode.ComputeMode;

public class Test {
    public static void main(String[] args) {
        System.out.println(ComputeMode.mode(new int[]{}));
        System.out.println(ComputeMode.mode(new int[]{1}));
        System.out.println(ComputeMode.mode(new int[]{1, 2, 3, 3}));
        System.out.println(ComputeMode.mode(new int[]{6, 3, 6, 6, 5, 9, 5}));
        System.out.println(ComputeMode.mode(new int[]{1, 1, 2, 3, 3, 9, 5}));
        System.out.println(ComputeMode.mode(new int[]{1,2,1,3,1,4,1,5,9,1,6,7}));
        System.out.println(ComputeMode.mode(new int[]{1,1,1,1}));
        System.out.println(ComputeMode.mode(new int[]{1,1,1,2,2,2,3,3,3}));
        System.out.println(ComputeMode.mode(new int[]{7,7,7,7,8,8,8,9,9,9,9}));
    }
}
