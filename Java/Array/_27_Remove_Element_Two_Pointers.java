package Java.Array;

public class _27_Remove_Element_Two_Pointers {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                if (k != i)
                    nums[i] = val;
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };

        System.out.println(removeElement(arr, 2));
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
