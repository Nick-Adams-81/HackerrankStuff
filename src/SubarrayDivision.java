import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int answer = 0;
        for(int i = 0; i <= s.size() -m; i++) {
            int sum = 0;
            for(int j = i; j < i + m; j++) {
                sum = sum + s.get(j);
            }
            if(sum == d) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(birthday(s, 3, 2));
    }
}
