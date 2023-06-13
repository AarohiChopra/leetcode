class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++)
        {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k)
            {
                int targetDiff = target - (nums[i] + nums[j] + nums[k]);
                if(targetDiff == 0) return (nums[i] + nums[j] + nums[k]);
                if(Math.abs(targetDiff) < Math.abs(closest) || (Math.abs(targetDiff) == Math.abs(closest) && targetDiff > closest))
                {
                    closest = targetDiff;
                }
                if(targetDiff > 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return target - closest; 
    }
}
