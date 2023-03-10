//Two Sum - Leet Code
//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return new int[] {0,0};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i < nums.length;i++){
            int remainder = target - nums[i];
            if(map.containsKey(remainder))
                return new int [] {map.get(remainder), i};
            else
                map.put(nums[i], i);
        }
        return new int[]{0,0};

    }
}
