// O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null)
        {
            return 0;
        }
        int windowStart = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++)
        {
            sum = Math.max(sum + nums[windowEnd], nums[windowEnd]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
