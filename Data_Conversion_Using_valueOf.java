package Programming;

//Data Conversion Using valueOf() method in Java

public class Data_Conversion_Using_valueOf {

	public static void main(String[] args) {
		int iNum = 30;
		double fNum = 4.56789;
		String s = "91";

		String sample = String.valueOf(iNum);
		System.out.println(sample);
		System.out.println(sample + s);
		sample = String.valueOf(fNum);
		System.out.println(sample);
		System.out.println(s + sample);

		char[] data = { 'G', 'E', 'E', 'K', 'S', ' ', 'F', 'O', 'R', ' ', 'G', 'E', 'E', 'K', 'S' };

		sample = String.valueOf(data, 0, 15);
		System.out.println(sample);

		String data1 = "Geeks for Geeks";
		boolean bool = data1.contains("Geeks");
		System.out.println(String.valueOf(bool));
	}

}
