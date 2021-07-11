class Solution {
	 public void moveZeroes(int[] nums) {
		    int i=0;
		    int end=nums.length-1;
		    while(i<end)
		    {
		        if(nums[i]==0)
		        {
		            for(int j=i;j<end;j++)
		            {
		                nums[j]=nums[j+1];
		            }
		            nums[end]=0;
		            i--;
		            end--;
		        }
		        i++;
		    }
		    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	int[] a= {0,1,0,3};
    	s.moveZeroes(a);
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(" "+a[i]);
    	}
    }
}
