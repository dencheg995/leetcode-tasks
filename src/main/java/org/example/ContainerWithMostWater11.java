package org.example;

/**
 * Solution for https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater11 {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxCount = 0;
        while (left < right) {

            int count = 0;
            if (height[left] < height[right]) {
                count = height[left] * (right - left);
                left++;
            } else {
                count = height[right] * (right - left);
                right--;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }
}
