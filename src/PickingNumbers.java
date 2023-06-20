import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> arr) {
        int count = 0;
        int max = 0;
        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(Math.abs(arr.get(i) - arr.get(j)) <= 1) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
            }
            count = 0;
        }
        return max + 1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);

        System.out.println(pickingNumbers(list));

    }
}
