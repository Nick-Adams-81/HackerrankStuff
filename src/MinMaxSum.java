import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

    public static void minMax(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        long total = 0;

        for(int n : arr) {
            total += n;
            if(n < min) min = n;
            if(n > max) max = n;
        }

        long minSum = total - max;
        long maxSum = total - min;
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        myArr.add(1);
        myArr.add(3);
        myArr.add(5);
        myArr.add(7);
        myArr.add(9);
//        for(int i : myArr) {
//            System.out.println(i);
//        }

        minMax(myArr);
    }
}
