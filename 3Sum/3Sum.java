class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length - 2; i++)
        {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
            int curr = nums[i];
            int j = i+1;
            int k = nums.length - 1;
            while(j < k)
            {
                int temp = nums[j] + nums[k];
                if(curr + temp == 0)
                {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[j] == nums[k+1]) k--;
                }
                else if(temp + curr > 0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        }
        return res;
    }
}
