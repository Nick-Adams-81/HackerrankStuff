import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindTheMedian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputSize = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> myArr = new ArrayList<>();
        for(int i = 0; i < inputSize; i++) {
            myArr.add(sc.nextInt());
        }
        Collections.sort(myArr);
        System.out.println(myArr.get(myArr.size() / 2));
    }
}
