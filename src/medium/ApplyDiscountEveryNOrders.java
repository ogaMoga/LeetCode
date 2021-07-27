package medium;

import java.util.HashMap;
import java.util.Map;

public class ApplyDiscountEveryNOrders {
    private final int n;
    private final double discount;
    private final Map<Integer, Integer> prices;

    private int currentIndex = 1;

    public ApplyDiscountEveryNOrders(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = 1 - (double) discount / 100;
        this.prices = new HashMap<>(products.length);
        for (int i = 0; i < products.length; i++) {
            this.prices.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        double sum = 0;
        for (int i = 0; i < product.length; i++) {
            sum += prices.get(product[i]) * amount[i];
        }
        if (currentIndex % n == 0) {
            sum *= discount;
        }
        currentIndex++;
        return sum;
    }
}
