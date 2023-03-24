/* 
 * Prompt : 
 * Given an array of positive numbers and a positive number ‘k’, 
 * find the maximum sum of any contiguous subarray of size ‘k’.
 */ 
public class Sol {
	public static int sol(int[] arr, int k)
	{
		int windowSum = 0;
		int windowStart = 0;
		int maxSum = 0;
		for(int windowEnd = 0; windowEnd < arr.length; windowEnd++)
		{
			windowSum += arr[windowEnd];
			if(windowEnd >= k-1)
			{
				maxSum = Math.max(maxSum, windowSum);
				windowSum -=arr[windowStart];
				windowStart++;
			}
		}
		return maxSum;
	}
	public static void main(String[] args)
	{
		int[] a = {2, 1, 5, 1, 3, 2};
		System.out.println(Sol.sol(a , 3));
	}
}
