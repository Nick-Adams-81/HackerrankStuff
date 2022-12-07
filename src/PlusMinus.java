import java.util.ArrayList;
import java.util.List;

public class PlusMinus {


    public static void plusMinus(int[] arr) {
        int size = arr.length;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int j : arr) {
            if (j > 0) {
                positiveCount++;
            } else if (j < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        double r1 = positiveCount / (double) size;
        double r2 = negativeCount / (double) size;
        double r3 = zeroCount / (double) size;
        System.out.printf("%.6f\n ", r1);
        System.out.printf("%.6f\n ", r2);
        System.out.printf("%.6f\n ", r3);
    }


    public static void main(String[] args) {
        int[] myList = {1, 1, 0, -1, -1};
        plusMinus(myList);


//        for (int j : myList) {
//            System.out.println(j);
//        }
    }
}
