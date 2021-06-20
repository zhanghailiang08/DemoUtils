package com.algorithm.leetcode;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 1
 * 2
 * 3
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 1
 * 2
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * ————————————————
 *
 * 提示：
 *
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * */

public class TwoNumCount {
    public static int[] twoSum1(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j])
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
      int [] nums = {2,7,8,214};
      int target = 9;
      int [] ints ;
      ints = twoSum2(nums,9);
      for(int s :ints){
          System.out.println(s);
        }
        System.out.println(twoSum1(nums,target).toString());
    }

   public static int[] twoSum2(int [] nums,int target){

       Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0;i<nums.length;i++){
           int partnerNumber = target - nums[i];
           if(map.containsKey(partnerNumber)){
               return new int[]{map.get(partnerNumber),i};
           }
           map.put(nums[i],i);
       }
        return null;
   }
}
