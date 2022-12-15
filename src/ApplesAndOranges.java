import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apple = 0;
        int orange = 0;

        for(int i = 0; i < apples.size(); i++) {
            int pos = a + apples.get(i);
            if(pos >= s && pos <= t) {
                apple++;
            }
        }

        for(int i = 0; i < oranges.size(); i++) {
            int pos = a + oranges.get(i);
            if(pos >= s && pos <= t) {
                orange++;
            }
        }

        System.out.println(apple);
        System.out.println(orange);
    }

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        oranges.add(5);
        oranges.add(-6);

        countApplesAndOranges(7, 11, 5, 15,apples, oranges);
    }
}
