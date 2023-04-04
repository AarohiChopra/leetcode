/*
 * Prompt :
 * Given a sorted array, create a new array containing squares of all the 
 * number of the input array in the sorted order.
 */
public class Sol {
	public static int[] sol(int[] arr)
	{
		int[] res = new int[arr.length];
		int low = 0;
		int high = arr.length - 1;
		int count = arr.length - 1;
		while(low <= high)
		{
			int lowSq = arr[low] * arr[low];
			int highSq = arr[high] * arr[high];
			if(lowSq < highSq) 
			{
				res[count] = highSq;
				high--;
			}
			else
			{
				res[count] = lowSq;
				low++;
			}
			count--;
		}
		return res;
	}
	public static void main(String[] args)
	{
		int[] arr = new int[] {-2, -1, 0, 2, 3};
		System.out.println(Sol.sol(arr));
	}
}
