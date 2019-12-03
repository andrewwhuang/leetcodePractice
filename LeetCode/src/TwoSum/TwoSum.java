package TwoSum;

import java.util.*;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
class TwoSum {
    public int[] TwoSum(int[] nums, int target) {

        // Check if nums contains (Target - Index), one search only
        for (int i = 0; i < nums.length; i++) {

            // Originally I checked for a all numbers again and filtered out n = i
            // However, duplicate searches were taking place and originally set my
            // values twice, before i returned directly in the if statement.
            // Similar to handshake factorial questions, y
            // you wouldnt need to compare previous numbers
            for (int n = i+1; n<nums.length; n++) {
                if (nums[n] == target - nums[i]) {
                    // value no longer set, and return directly. No instantiation
                    // or extra memories needed.
                    return new int[] {i,n};
                }
            }
        }
        // needed return statement, threw exception from the solutions page instead.
        throw new IllegalArgumentException("No two sum solution");
    }
}
