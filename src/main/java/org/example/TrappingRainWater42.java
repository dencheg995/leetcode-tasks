package org.example;

/**
 * Solution for https://leetcode.com/problems/trapping-rain-water/description/
 */
public class TrappingRainWater42 {

    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int countWater = 0;
        int maxLengthLeft = 0;
        int maxLengthRight = 0;

        while (left < right) {

            if (height[left] < height[right]) {
                if (height[left] > maxLengthLeft) {
                    maxLengthLeft = height[left];
                }
                countWater += maxLengthLeft - height[left];
                left++;
            } else {
                if (height[right] > maxLengthRight) {
                    maxLengthRight = height[right];
                }
                countWater += maxLengthRight - height[right];
                right--;
            }

        }

        return countWater;
    }

}
