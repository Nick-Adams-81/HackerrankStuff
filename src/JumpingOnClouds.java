import java.util.ArrayList;
import java.util.List;

public class JumpingOnClouds {

    public static int jumpOnClouds(List<Integer> c) {
        int jumps = 0;
        int i = 0;
        while(i < c.size() -1) {
            if(i + 2 == c.size() || c.get(i + 2) == 1) {
                i++;
                jumps++;
            } else {
                i += 2;
                jumps++;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        List<Integer> jumps = new ArrayList<>();
        jumps.add(0);
        jumps.add(0);
        jumps.add(1);
        jumps.add(0);
        jumps.add(0);
        jumps.add(1);
        jumps.add(0);

        System.out.println(jumpOnClouds(jumps));
    }
}
