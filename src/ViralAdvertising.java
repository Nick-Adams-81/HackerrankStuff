public class ViralAdvertising {

    public static int viralAdvertising(int n) {
        int shared = 5;
        int likes;
        int count = 0;
        for(int i = 0; i < n; i++) {
            likes = shared / 2;
            shared = likes * 3;
            count = count + likes;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

}
