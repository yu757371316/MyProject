package algorithm.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 *
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class TwoSum {
    private Map<Integer, Integer> value2Index = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (value2Index.containsKey(target - nums[i])) {
                return new int[]{i, value2Index.get(target - nums[i])};
            }
            value2Index.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
