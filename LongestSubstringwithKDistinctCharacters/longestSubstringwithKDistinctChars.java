
/*
 * Prompt:
 * Given a string, find the length of the longest 
 * substring in it with no more than K distinct characters.
 */
import java.util.*;
public class Sol {
	public static int sol(String str, int k)
	{
		int max = 0;
		int windowStart = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int windowEnd = 0; windowEnd < str.length(); windowEnd++)
		{
			char right = str.charAt(windowEnd);
			map.put(right, map.getOrDefault(right, 0) + 1);
			while(map.size() > k)
			{ 
				char left = str.charAt(windowStart++);
				map.put(left, map.get(left) - 1);
				if(map.get(left) == 0) map.remove(left);
			}
			max = Math.max(max, windowEnd - windowStart + 1);
		}
		return max;
	}
	public static void main(String[] args)
	{
		System.out.println(Sol.sol("araaci", 2));
	}
}
