package org.example;

/**
 * Solution for https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *  [6,7,0,1,2,4,5]
 *  [7,0,1,2,4,5,6]
 * 0124567
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * Example 3:
 *
 * Input: nums = [1], target = 0
 * Output: -1
 */
public class SearchInRotatedSortedArray33 {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        //поиск первого элемента в сдвинутом массиве
        //пример 6,7,0,1,2,4,5
        //шаг 1: calculate mid.val = 1, mid = 3;
        //step 2: mid.val < right.val; right = mid; right.val = 1, right = 3; left.val = 6, left = 0;
        //step 3: calculate mid = 1, mid.val = 7;
        //step 4: mid.val > right.val; left = mid + 1; right.val = 1, right = 3; left.val = 0, left = 2;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }


        int leftSecondPart = left;
        left = 0;
        right = nums.length - 1;
        if (target >= nums[leftSecondPart] && target <= nums[right]) {
            left = leftSecondPart;
        } else {
            right = leftSecondPart;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;
    }

}
