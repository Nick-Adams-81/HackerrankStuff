import java.util.ArrayList;
import java.util.List;

public class DesignerPdfViewer {

    public static int designerPDFViewer(List<Integer> h, String word) {
        int max = -1;
        for(int i = 0; i < word.length(); i++) {
            int ascii = (int)word.charAt(i);
            int val = ascii - 97;
            if(h.get(val) > max) {
                max = h.get(val);
            }
        }
        return word.length() * max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(7);

        System.out.println(designerPDFViewer(list, "zaba"));
    }
}
