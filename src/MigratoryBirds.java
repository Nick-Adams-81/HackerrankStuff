import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        int max = 0;
        int[] count = new int[3 << 1];

        for(int val : arr) {
            count[val]++;
            max = Math.max(max, count[val]);
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] == max) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        myArr.add(1);
        myArr.add(2);
        myArr.add(2);
        myArr.add(3);
        myArr.add(3);
        System.out.println(migratoryBirds(myArr));
    }
}
