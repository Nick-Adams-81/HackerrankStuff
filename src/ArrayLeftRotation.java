import java.util.Arrays;

public class ArrayLeftRotation {

    public static int[] rotateLeft(int[] a, int d) {
        int size = a.length;
        int[] rotatedArr = new int[size];

        int i = 0;
        int rotateIndex = d;
        while(rotateIndex < size) {
            rotatedArr[i] = a[rotateIndex];
            i++;
            rotateIndex++;
        }
        rotateIndex = 0;
        while(rotateIndex < d) {
            rotatedArr[i] = a[rotateIndex];
            i++;
            rotateIndex++;
        }
        return rotatedArr;
    }
    public static void main(String[] args) {

        int[] myArr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateLeft(myArr, 2)));
    }
}
