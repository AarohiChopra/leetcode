import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
    int count=0;
    int sum=0;
    HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
    hash.put(0,1);   
    for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
     if(hash.containsKey(sum-k))
     {
         count+=hash.get(sum-k);
     }
        hash.put(sum, hash.getOrDefault(sum,0)+1);
    }
        return count;
    }
    public static void main(String[] args)
    {
    	Solution s=new Solution();
    	int[] a= {1,1,1};
    	int k=3;
    	System.out.println(s.subarraySum(a,k));
    }
}

    	
