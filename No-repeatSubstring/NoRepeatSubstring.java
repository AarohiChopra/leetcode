
/*
 * Prompt:
 * Given a string, find the length of the longest substring 
 * which has no repeating characters.
 */
import java.util.*;
public class Sol {
	public static int sol(String str)
	{
		int max = 0;
		int windowStart = 0;
		HashSet<Character> set = new HashSet<Character>();
		for(int windowEnd = 0; windowEnd < str.length(); windowEnd++)
		{
			char right = str.charAt(windowEnd);
			while(set.contains(right))
			{
				char left = str.charAt(windowStart++);
				set.remove(left);
			}
			set.add(right);
			max = Math.max(max, windowEnd - windowStart + 1);
			
		}
		return max;
	}
	public static void main(String[] args)
	{
		System.out.println(Sol.sol("abbbb"));
	}

}
