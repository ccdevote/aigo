package me.zhiyong.aigo.examples.letcode;


import java.util.Arrays;

/**
 * Created by afanty on 17-2-14.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            Integer pos = indexOf(nums, i, target - nums[i]);
            if (pos != null) {
                return new int[]{i, pos};
            }
        }
        return null;
    }

    public Integer indexOf(int[] nums, int start, int target) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            continue;
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] a = new int[]{9, 6, 2, 9, 7, 1, 0, 8, 0, 0, 9};
        int[] b = new int[a.length * 2];
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(twoSum.twoSum(a, 3)));
    }
}
