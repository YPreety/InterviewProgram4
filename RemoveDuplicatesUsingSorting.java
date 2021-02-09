package Programming;

import java.util.Arrays;

/*Input string:  geeksforgeeks
1) Sort the characters
   eeeefggkkorss
2) Remove duplicates
    efgkorskkorss
3) Remove extra characters
     efgkors*/
//Time Complexity: O(nlogn)

public class RemoveDuplicatesUsingSorting {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println(removeDups(str));

	}

	static String removeDupsSorted(String str) {
		int res_ind = 1, ip_ind = 1;
		char arr[] = str.toCharArray();
		while (ip_ind != arr.length) {
			if (arr[ip_ind] != arr[ip_ind - 1]) {
				arr[res_ind] = arr[ip_ind];
				res_ind++;
			}
			ip_ind++;
		}
		str = new String(arr);
		return str.substring(0, res_ind);
	}

	static String removeDups(String str) {
		char temp[] = str.toCharArray();
		Arrays.sort(temp);
		str = new String(temp);
		return removeDupsSorted(str);
	}
}
