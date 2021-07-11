
class Solution {
    public int removeElement(int[] nums, int val) {
    int i=0;
    int length=nums.length;
    while(i<length)
    {
        if(nums[i]==val)
        {
            for(int j=i;j<length-1;j++)
            {
                nums[j]=nums[j+1];
            }
            i--;
            length--;
        }
        i++;
    }
        return length;
    }
}