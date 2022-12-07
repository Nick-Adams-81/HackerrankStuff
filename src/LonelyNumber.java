import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyNumber {


    public static int lonelyInteger(List<Integer> arr) {

        Set<Integer> set = new HashSet<>();
        int lonelyNumber = 0;
        for(Integer i : arr) {
            if(!set.contains(i)){
                set.add(i);
            } else {
                set.remove(i);
            }
        }
        for(Integer s : set) {
            lonelyNumber = s;
        }
        return lonelyNumber;
    }
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(4);
        myList.add(3);
        myList.add(1);

        System.out.println(lonelyInteger(myList));

//        for (int i : myList) {
//            System.out.println(i);
//        }
    }
}
