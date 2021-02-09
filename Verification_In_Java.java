package Programming;

public class Verification_In_Java {

	private float bal;

	public static void main(String[] args) {
		Verification_In_Java obj = new Verification_In_Java();
		System.out.println(obj.depositBalance(4000));

	}

	float depositBalance(int bal) {
		int myBal = bal;
		this.bal += myBal;
		return this.bal;
	}
}
