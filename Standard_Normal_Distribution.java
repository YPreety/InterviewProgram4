package Programming;

import java.util.Random;

/*Standard Normal Distribution
The standard normal distribution is a special case of the normal distribution. 
It occurs when a normal random variable has a mean of 0 and a standard deviation of 1. 
The normal random variable of a standard normal distribution is called a standard score or a z score.
Z = (X - u) / s
where:
Z = value on the standard normal distribution
X = value on the original distribution
u = mean of the original distribution
s = standard deviation of the original distribution

The nextGaussian() method is used to get the next random, 
Normally distributed double value with mean 0.0 and standard deviation 1.0.*/

public class Standard_Normal_Distribution {

	public static void main(String[] args) {
		double Z, X, s, u;
		X = 26;
		u = 50;
		s = 10;
		Z = (X - u) / s;
		System.out.println("the Z-value obtained is: " + Z);
		Random ran = new Random();
		double nxt = ran.nextGaussian();
		System.out.println("The next Gaussian value generated is : " + nxt);
	}
}
