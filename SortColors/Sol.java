class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
        {
            return;
        }
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        while(i <= high && low < high)
        {
            if(nums[i] == 0)
            {
                nums[i] = nums[low];
                nums[low] = 0;
                low++;
                i++;
            }
            else if(nums[i] == 2)
            {
                nums[i] = nums[high];
                nums[high] = 2;
                high--;
            }
            else
            {
                i++;
            }
        }
    }
}
