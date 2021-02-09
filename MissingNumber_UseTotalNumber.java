package Programming;

public class MissingNumber_UseTotalNumber {

	public static void main(String[] args) {
		int n = 8;
		int a [] = {1,4,5,3,7,8,6};
		int sumOfNumbers = n * (n+1)/2;
		int sumOfElements = 0;
		for (int i =0; i <a.length; i++){
			sumOfElements = sumOfElements + a[i];
		}
        int missingNumber = sumOfNumbers -  sumOfElements;
        System.out.println(missingNumber);
	}
}
