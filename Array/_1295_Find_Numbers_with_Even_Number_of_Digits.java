package Array;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int FindNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (NumberOfCharacters(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int NumberOfCharacters(int a) {
        int count = 1;
        while (a >= 10) {
            count++;
            a /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 22 };
        System.out.println(FindNumbers(arr));
    }
}
