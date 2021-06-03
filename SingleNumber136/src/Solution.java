import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> h=new HashMap<Integer,Integer>();
    for(int i: nums)
    {
       if(h.containsKey(i))
       {
           h.put(i,-1);
           System.out.println("No : "+i);
       }
       else
       {
           h.put(i,1);
           System.out.println("Added : "+i);
       }
    }
        for(int i : h.keySet())
        {
            if(h.get(i)==1)
            {
                System.out.println("found : "+i);
                return i;
            }
        }
        return -1;
    }
}