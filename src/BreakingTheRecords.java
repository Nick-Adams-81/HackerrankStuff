import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int maxCount = 0;
        int minCount = 0;
        int maxValue = scores.get(0);
        int minValue = scores.get(0);

        for(int i = 1; i < scores.size(); i++) {
            int val = scores.get(i);
            if(val > maxValue) {
                maxValue = val;
                maxCount++;
            }
            if(val < minValue) {
                minValue = val;
                minCount++;
            }
        }
        ArrayList<Integer> el = new ArrayList<>();
        el.add(maxCount);
        el.add(minCount);

        return el;
    }

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        System.out.println(breakingRecords(scores));
    }
}
