
import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
    HashMap<Character, Integer> h=new HashMap<Character, Integer>();
    for(int i=0;i<s.length();i++)
    {
      if(h.containsKey(s.charAt(i)))
      {
          h.put(s.charAt(i), -1);
      }
    else
    {
        h.put(s.charAt(i), i); 
    }
            
    }
        int min=Integer.MAX_VALUE;
        for(Character c: h.keySet())
        {
            if(h.get(c)==-1)
            {    
            }
            else if(h.get(c)<min)
            {
                min=h.get(c);
            }
        }
        return min==Integer.MAX_VALUE? -1 : min;
    }
}