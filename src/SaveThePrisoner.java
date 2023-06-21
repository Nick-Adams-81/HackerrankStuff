public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {
        int r = m % n;
        if((r + s - 1) % n == 0) return n;
        else return ((r + s - 1) % n);
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5, 2, 2));
    }
}
