package Array;

public class _88_Merge_Sorted_Array_Two_Pointers {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while ((k >= 0)) {
            if (i < 0 && j >= 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (j < 0 && i >= 0) {
                nums1[k] = nums1[i];
                i--;
            } else {
                if (i >= 0 && j >= 0 && nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                }
                else{
                    nums1[k] = nums2[j];
                    j--;
                }
            }
            k--;
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