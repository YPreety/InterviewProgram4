package Programming;

public class Unchecked_Exceptions {

	public static void main(String[] args) {
		Unchecked_Exceptions obj = new Unchecked_Exceptions();
		obj.p();
		System.out.println("Normal flow...");
	}

	void p() {
		try {
			n(); 
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

	void n() {
		m();
	}

	void m() {
		int data = 50 / 0; 
	}
}
