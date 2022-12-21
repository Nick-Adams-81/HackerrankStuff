import java.util.ArrayList;
import java.util.List;

public class MaxToys {

    public static int maxToys(List<Integer> prices, int k) {
        int maxToys = 0;
        if(prices.size() == 0) return maxToys;
        for (Integer price : prices) {
            k -= price;
            if (k < 0) return maxToys;
            maxToys++;
        }
        return maxToys;
    }

    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(2);
        prices.add(3);
        prices.add(4);
        System.out.println(maxToys(prices, 7));
    }
}
