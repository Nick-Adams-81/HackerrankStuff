public class MarsExplorer {


    public static int marsExplorer(String s) {
        int count = 0;

        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length -2; i++) {
            if(arr[i] != 'S') count++;
            if(arr[i + 1] != 'O') count++;
            if(arr[i + 2] != 'S') count++;
            i = i + 2;
        }


        return count;
    }
    public static void main(String[] args) {
        String sos = "SOS";
        System.out.println(marsExplorer(sos));
    }
}
