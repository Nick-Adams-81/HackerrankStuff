import java.util.Scanner;

public class CatAndMouse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int distance = Math.abs(x - z);
            int distance2 = Math.abs(y - z);
            if(distance < distance2) System.out.println("Cat A");
            else if (distance > distance2) System.out.println("Cat B");
            else System.out.println("Mouse C");
        }
    }
}
