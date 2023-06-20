import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        int max = Collections.max(height);
        if(k > max) return 0;
        else return max - k;
    }

    public static void main(String[] args) {
        List<Integer> hurdles = new ArrayList<>();
        hurdles.add(1);
        hurdles.add(2);
        hurdles.add(3);
        hurdles.add(3);
        hurdles.add(2);

        System.out.println(hurdleRace(1, hurdles));

    }
}
