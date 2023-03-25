/*
 * Prompt:
 * Given a string with lowercase letters only, 
 * if you are allowed to replace no more than ‘k’ letters with any letter, 
 * find the length of the longest substring having the same 
 * letters after replacement.
 */
import java.util.*;
public class Sol {
	public static int sol(String str, int k)
	{
		int max = 0;
		int maxChar = 0;
		int windowStart = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int windowEnd = 0; windowEnd < str.length(); windowEnd++)
		{
			char right = str.charAt(windowEnd);
			map.put(right, map.getOrDefault(right, 0) + 1);
			maxChar = Math.max(maxChar, map.get(right));
			while(windowEnd - windowStart + 1 - maxChar > k)
			{
				char left = str.charAt(windowStart++);
				map.put(left, map.get(left) - 1);
				if(map.get(left) == 0) map.remove(left);
				
			}
			max = Math.max(windowEnd - windowStart + 1, max);
		}
		return max;
	}
	public static void main(String[] args)
	{
		System.out.println(Sol.sol("abbcb", 1));
	}

}
