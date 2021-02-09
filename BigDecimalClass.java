package Programming;

import java.math.BigDecimal;

/*The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, 
format conversion and hashing. It can handle very large and very small floating point numbers with great precision 
but compensating with the time complexity a bit.
A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale. If greater than or equal to 
zero, the scale is the number of digits to the right of the decimal point. If less than zero, the unscaled value of the
number is multiplied by 10^(-scale).

Input : double a=0.03;
double b=0.04;
double c=b-a;
System.out.println(c);
Output :0.009999999999999998

Input : BigDecimal _a = new BigDecimal("0.03");
BigDecimal _b = new BigDecimal("0.04");
BigDecimal _c = _b.subtract(_a);
System.out.println(_c);
Output :0.01

Need Of BigDecimal

1. The two java primitive types(double and float) are floating point numbers, which is stored as a binary representation of a 
fraction and a exponent.
2. Other primitive types(except boolean) are fixed-point numbers. Unlike fixed point numbers, floating point numbers will most
of the times return an answer with a small error (around 10^-19) This is the reason why we end up with 0.009999999999999998 
as the result of 0.04-0.03 in the above example.*/

public class BigDecimalClass {

	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("124567890.0987654321");
		BigDecimal bd2 = new BigDecimal("987654321.123456789");

		// Addition of two BigDecimals
		bd1 = bd1.add(bd2);
		System.out.println("BigDecimal1 = " + bd1);

		// Multiplication of two BigDecimals
		bd1 = bd1.multiply(bd2);
		System.out.println("BigDecimal1 = " + bd1);

		// Subtraction of two BigDecimals
		bd1 = bd1.subtract(bd2);
		System.out.println("BigDecimal1 = " + bd1);

		// Division of two BigDecimals
		bd1 = bd1.divide(bd2);
		System.out.println("BigDecimal1 = " + bd1);

		// BigDecima1 raised to the power of 2
		bd1 = bd1.pow(2);
		System.out.println("BigDecimal1 = " + bd1);

		// Negate value of BigDecimal1
		bd1 = bd1.negate();
		System.out.println("BigDecimal1 = " + bd1);

	}

}
