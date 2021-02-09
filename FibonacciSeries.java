package Programming;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =10;
		int i =0;
		int j =1;
		int temp;
		System.out.print("Fibonacci series " + i + " " + j + " ");
		for(int k = 0 ; k<n ; k++){
			temp = i +j;
			i = j;
			j = temp;
			System.out.print(temp + " ");
		}
	}

}
