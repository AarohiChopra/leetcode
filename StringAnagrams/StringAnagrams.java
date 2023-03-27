/*
 * Prompt: 
 * Write a function to return a list of starting 
 * indices of the anagrams of the pattern in the given string.
 */

import java.util.*;

public class Sol {
	public static List<Integer> sol(String str, String pattern)
	{
		List<Integer> res = new ArrayList<Integer>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : pattern.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0) + 1);
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
			if(matched == map.size()) res.add(windowStart);
			while(windowEnd - windowStart + 1 >= pattern.length())
			{
				char left = str.charAt(windowStart++);
				if(map.containsKey(left))
				{
					if(map.get(left) == 0) matched--;
					map.put(left, map.get(left) + 1);
				}
			}
			
		}
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println(Sol.sol("abbcabc", "abc"));
	}
}
