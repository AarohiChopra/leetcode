class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int minLen=Integer.MAX_VALUE;
    int windowSum=0;
    int start=0;
    int length=0;
     for(int i=0;i<nums.length;i++)
     {
       windowSum+=nums[i];
           length++;
    while(windowSum>=target)
    {
       if(length<minLen)
       {
           minLen=length;
       }
       windowSum-=nums[start];
        start++;
        length--;
    }
     }
        return minLen==Integer.MAX_VALUE ? 0 : minLen;
    }
}