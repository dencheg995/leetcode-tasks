package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for https://leetcode.com/problems/binary-search/
 */
public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(diff), i};
            }
        }

        return null;
    }
}
