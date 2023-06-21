import java.util.ArrayList;
import java.util.List;

public class AngryProffesor {

    public static String angryProfessor(int k, List<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) <= 0) count++;
        }
        if(count >= k) return "NO";
        else return "YES";
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(-3);
        list1.add(4);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(-1);
        list2.add(2);
        list2.add(1);

        System.out.println(angryProfessor(3, list1));
        System.out.println(angryProfessor(2, list2));
    }
}
