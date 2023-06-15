// O(n^2)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null)
        {
            return 0;
        }
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = 0;
            for(int j = i; j < nums.length; j++)
            {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
