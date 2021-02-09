package Design_Patterns;

/*Consecutive steps to roof top Given heights of consecutive buildings,find the maximum number of consecutive steps 
one can put forward such that he gain a increase in altitude while going from roof of one building to next adjacent one.
Input:arr[]={1,2,2,3,2}
Output:1 Explanation:
Maximum consecutive steps from 1 to 2 OR 2 to 3.

Input:arr[]={1,2,3,4}
Output:3*/
public class ConsecutiveStepsToRoofTop {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int len = arr.length;

		System.out.println(find_consecutive_steps(arr, len));

	}

	static int find_consecutive_steps(int arr[], int len) {
		int count = 0;
		int maximum = 0;

		for (int index = 1; index < len; index++) {

			// count the number of consecutive
			// increasing height building
			if (arr[index] > arr[index - 1])
				count++;
			else {
				maximum = Math.max(maximum, count);
				count = 0;
			}
		}

		return Math.max(maximum, count);
	}

}
