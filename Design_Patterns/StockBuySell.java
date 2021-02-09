package Design_Patterns;

import java.util.ArrayList;

/*Stock Buy Sell to Maximize Profit
The cost of a stock on each day is given in an array, 
find the max profit that you can make by buying and selling in those days. 
For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, 
selling on day 3. Again buy on day 4 and sell on day 6.
If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.*/

class Interval {
	int buy, sell;
}

public class StockBuySell {

	public static void main(String[] args) {
		StockBuySell stock = new StockBuySell();
		int price[] = { 100, 180, 260, 310, 40, 535, 695 };
		int n = price.length;
		stock.stockBuySell(price, n);
	}

	void stockBuySell(int price[], int n) {
		if (n == 1)
			return;
		int count = 0;
		ArrayList<Interval> sol = new ArrayList<Interval>();
		int i = 0;
		while (i < n - 1) {
			while ((i < n - 1) && (price[i + 1] <= price[i]))
				i++;
			if (i == n - 1)
				break;
			Interval e = new Interval();
			e.buy = i++;
			while ((i < n) && (price[i] >= price[i - 1]))
				i++;
			e.sell = i - 1;
			sol.add(e);
			count++;
		}
		if (count == 0)
			System.out.println("There is no day when buying the stock " + "will make profit");
		else
			for (int j = 0; j < count; j++)
				System.out.println("Buy on day: " + sol.get(j).buy + "        " + "Sell on day : " + sol.get(j).sell);

		return;
	}

}
