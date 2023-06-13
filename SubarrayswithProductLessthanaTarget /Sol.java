class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        List<List<Integer>> res = new  ArrayList<List<Integer>>();
        int prod = 1;
        int left = 0;
        for(int right = 0; right < nums.length ; right++)
        {
            prod *= nums[right];
            while(prod >= k && left < nums.length)
            {
                prod = prod/nums[left++];
            }
            List<Integer> temp = new LinkedList<>();
            for(int i = right; i >= left; i--)
            {
                temp.add(0, nums[i]);
                res.add(new ArrayList<>(temp));
            }
        }
        return res;
    }
}
