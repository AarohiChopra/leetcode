/* 
 * Prompt:
 * Given an array of characters where each character represents a fruit tree, 
 * you are given two baskets and your goal is to put maximum number of fruits 
 * in each basket. 
 * The only restriction is that each basket can have only one type of fruit.
 * You can start with any tree, but once you have started you can’t skip a tree. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
 * Write a function to return the maximum number of fruits in both the baskets.
 * 
 */
import java.util.*;
public class Sol {
	public static int sol(char[] arr)
	{
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int windowStart = 0;
		for(int windowEnd = 0; windowEnd < arr.length; windowEnd++)
		{
			char right = arr[windowEnd];
			map.put(right, map.getOrDefault(right, 0) + 1);
			while(map.size() > 2)
			{
				char left = arr[windowStart++];
				map.put(left, map.get(left) - 1);
				if(map.get(left) == 0)map.remove(left);
			}
			max = Math.max(max, windowEnd - windowStart + 1);
		}
		return max;
	}
	public static void main(String[] args)
	{
		char[] arr = {'A', 'B', 'C', 'B', 'B', 'C'};
		System.out.println(Sol.sol(arr));
	}
}
