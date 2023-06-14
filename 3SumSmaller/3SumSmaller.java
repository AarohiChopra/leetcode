public class 3SumSmaller {
    /**
     * @param nums:  an array of n integers
     * @param target: a target
     * @return: the number of index triplets satisfy the condition nums[i] + nums[j] + nums[k] < target
     */
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++)
        {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k)
            {
                int temp = nums[i] + nums[j] + nums[k];
                if(temp >= target)
                {
                    k--;
                }
                else
                {
                    count += (k-j);
                    j++;
                } 
            }
        }
        return count;
    }
}
