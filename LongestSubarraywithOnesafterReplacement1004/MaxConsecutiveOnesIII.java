import java.util.ArrayList;

/*
 * Prompt :
 * Given an array containing 0s and 1s, 
 * if you are allowed to replace no more than ‘k’ 0s with 1s, 
 * find the length of the longest contiguous subarray having all 1s.
 */

public class Sol {
	public static int sol(int[] arr, int k)
	{
		int max = 0;
		int windowStart = 0;
		int windowSum = 0;
		for(int windowEnd = 0; windowEnd < arr.length; windowEnd++)
		{
			int right = arr[windowEnd];
			windowSum += right;
			while(windowEnd - windowStart + 1 - windowSum > k)
			{
				int left = arr[windowStart++];
				if(left == 1) windowSum--;
			}
			max = Math.max(windowEnd - windowStart + 1, max);
		}
		return max;
	}
	public static void main(String[] args)
	{
		int[] arr =  {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
		int k = 3;
		System.out.println(Sol.sol(arr, k));
	}
}
