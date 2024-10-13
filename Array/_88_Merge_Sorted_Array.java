package Array;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int a : nums2) {

            chen(a, nums1, m);
            m++;

        }
    }

    private static void chen(int a, int[] nums1, int m) {
        boolean found = false;
        for (int i = 0; i < m; i++) {
            if (a < nums1[i]) {
                found = true;

                // dịch mảng sang phải

                for (int j = m; j > i; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[i] = a;
                break;
            }
        }
        if (!found) {
            nums1[m] = a;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3, n = 3;
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, m, nums2, n);
        for (int a : nums1) {
            System.out.println(a);
        }
    }
}
