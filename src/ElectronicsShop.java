public class ElectronicsShop {

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int price = 0;
        for (int i : keyboards) {
            for(int j : drives) {
                if((i + j) >= price && (i + j) <= b) {
                    price = i + j;
                }
            }
        }
        if(price == 0) price = -1;
        return price;
    }

    public static void main(String[] args) {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        System.out.println(getMoneySpent(keyboards, drives, 10));
    }
}
