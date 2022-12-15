import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {



    public static int birthdayCandles(List<Integer> candles) {

        int maxCandleHeight = Integer.MIN_VALUE;
        int candleCount = 0;

        for(int i = 0; i < candles.size(); i++) {
            if(candles.get(i) == maxCandleHeight) candleCount++;

            if(candles.get(i) > maxCandleHeight) {
                maxCandleHeight = candles.get(i);
                candleCount = 1;
            }
        }
        return candleCount;
    }
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(4);
        myList.add(1);
        myList.add(3);
        System.out.println(birthdayCandles(myList));
    }
}
