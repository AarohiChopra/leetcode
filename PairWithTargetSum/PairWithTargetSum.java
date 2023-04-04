/*
 * Prompt: 
 * Given an array of sorted numbers and a target sum, 
 * find a pair in the array whose sum is equal to the given target.
 */
public class Sol {
	public static int[] sol(int[] arr, int targetSum)
	{
		int[] res =  new int[2];
		int low = 0;
		int high = arr.length - 1;
		while(low < high)
		{
			if(arr[low] + arr[high] == targetSum)
			{
				res[0] = low;
				res[1] = high;
				return res;
			}
			else if(arr[low] + arr[high] > targetSum)
			{
				high--;
			}
			else
			{
				low++;
			}
		}
		return new int[] {-1, -1};
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 6};
 		System.out.print(Sol.sol(arr, 6));
	}
}
