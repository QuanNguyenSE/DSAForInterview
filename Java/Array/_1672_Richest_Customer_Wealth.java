package Java.Array;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = -1;
        for (int i = 0; i < accounts.length; i++) {
            int sum =0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > max) max = sum;
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
