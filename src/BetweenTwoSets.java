import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        int currentFactor = a.get(a.size() -1);
        int flag;

        while(currentFactor <= b.get(0)) {
            flag = 0;
            for(int i = 0; i < a.size(); i++) {
                if(currentFactor % a.get(i) != 0) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 0) {
                for(int i = 0; i < b.size(); i++) {
                    if(b.get(i) % currentFactor != 0) {
                        flag = 1;
                        break;
                    }
                }

                if(flag == 0) {
                    count++;
                }
                currentFactor++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(6);
        b.add(24);
        b.add(36);

        System.out.println(getTotalX(a, b));
    }
}
