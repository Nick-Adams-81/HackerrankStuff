public class KangarooJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String output = "NO";
        if(v1 > v2) {
            while(x1 <= x2) {
                if(x1 == x2) {
                    output = "YES";
                    break;
                } else {
                    x1 = x1 + v1;
                    x2 = x2 + v2;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }
}
