import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static int divisiblePairs(int n, int k, List<Integer> arr) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((arr.get(i) + arr.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(divisiblePairs(6, 5, list));
    }
}
