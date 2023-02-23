package edu.wku;

import edu.wku.smallestposnum.SmallestPosNum;

public class Test {
    public static void main(String[] args) {
        System.out.println(SmallestPosNum.smallestPosNum(new int[]{1,2,3}));
        System.out.println(SmallestPosNum.smallestPosNum(new int[]{0,2,5}));
        System.out.println(SmallestPosNum.smallestPosNum(new int[]{-2,5,-1,3,-4}));
        System.out.println(SmallestPosNum.smallestPosNum(new int[]{-2,-9,-1,-4}));
        System.out.println(SmallestPosNum.smallestPosNum(new int[]{1231,10,-15,-1,16,98,-100,0}));
    }
}
