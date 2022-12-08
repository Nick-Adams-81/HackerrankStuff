import java.net.SocketImpl;
import java.util.Scanner;

public class CompareTriplets {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alice = new int[SIZE];
        int[] bob = new int[SIZE];

        for(int i = 0; i < SIZE; i++) {
            alice[i] = sc.nextInt();
        }

        for(int i = 0; i < SIZE; i++) {
            bob[i] = sc.nextInt();
        }

        int aliceScore = 0;
        int bobScore = 0;
        for(int i = 0; i < SIZE; i++) {
            if(alice[i] > bob[i]) {
                aliceScore++;
            } else if(bob[i] > alice[i]) {
                bobScore++;
            }
        }

        System.out.println(aliceScore + " " + bobScore);

    }
}
