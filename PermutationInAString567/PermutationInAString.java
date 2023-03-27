/*
 * Prompt :
 * Given a string and a pattern, 
 * find out if the string contains any permutation of the pattern.
 */

import java.util.*;

public class Sol {
	public static boolean sol(String str, String pattern)
	{
		if(str.length() < pattern.length()) throw new IllegalArgumentException("Invalid Parameters");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : pattern.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0) +  1);
		}
		int windowStart = 0;
		int matched = 0;
		for(int windowEnd = 0; windowEnd < str.length(); windowEnd++)
		{
			char right = str.charAt(windowEnd);
			if(map.containsKey(right))
			{
				map.put(right, map.get(right) - 1);
				if(map.get(right) == 0) matched++;
			}
			if(matched == map.size()) return true;
			while(windowEnd - windowStart + 1 >= pattern.length())
			{
				char left =str.charAt(windowStart++);
				if(map.containsKey(left))
				{
					if(map.get(left) == 0) matched--;
					map.put(left, map.get(left) + 1);
				}
			}
			
		}
		return false;
	}
	public static void main(String[] args)
	{
		String str ="oidbcfaf";
		String Pattern="abc";
		System.out.println(Sol.sol(str, Pattern));
	}
}
