package Programming;



/*NumberFormat is an abstract base class for all number formats. This class provides the interface for formatting and parsing
numbers. NumberFormat also provides methods for determining which locales (US, India, Italy, etc) have number formats, 
and what their names are. NumberFormat helps you to format and parse numbers for any locale.

Some important points about NumberFormat class:

1.NumberFormat class is present in java.text package and it is an abstract class.
2.NumberFormat class implements Serializable, Cloneable.
3.NumberFormat is the direct child class of Format class.
4.Number formats are generally not synchronized. It is recommended to create separate format instances for each thread. 
If multiple threads access a format concurrently, it must be synchronized externally.

Methods present in NumberFormat class:

1.public static NumberFormat getInstance();: To get the NumberFormat object for default Locale.
2.public static NumberFormat getCurrencyInstance();: To get the NumberFormat object for default Locale to represent in 
specific Currency.
3.public static NumberFormat getPercentInstance();:
4.public static NumberFormat getInstance(Locale l);: To get the NumberFormat object for the specified Locale object.
5.public static format(long l);:To convert java number to locale object.*/


import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo_I18N {

	public static void main(String[] args) {
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.CHINA);

		System.out.println("ITALY representation of " + d + " : " + nf.format(d));

		System.out.println("US representation of " + d + " : " + nf1.format(d));

		System.out.println("CHINA representation of " + d + " : " + nf2.format(d));

	}

}
