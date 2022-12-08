import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {
        int diagonalOne = 0;
        int diagonalTwo = 0;

        for (int i = 0; i < arr.size(); i++) {
            diagonalOne += arr.get(i).get(i);
        }

        for(int i = 0; i < arr.size(); i++) {
            diagonalTwo += arr.get(i).get(arr.size() - (i + 1));
        }

        return Math.abs(diagonalOne - diagonalTwo);
    }
    public static void main(String[] args) {


    }
}
