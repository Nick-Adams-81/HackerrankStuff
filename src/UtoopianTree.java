public class UtoopianTree {

    public static int utopianTree(int n) {
        int value = 1;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) value++;
            else value *= 2;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(0));
    }
}
