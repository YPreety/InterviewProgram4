package Programming;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println("original number " +num);
		System.out.println("reverse number " +reverseNumber(num));
	}
	public static int reverseNumber(int number){
        int reverse=0;
        int remainder;
        
        while(number>0){
               remainder=number%10;
               number=number/10;
               reverse=reverse*10+remainder;
        }          
        return reverse;
   }
}
