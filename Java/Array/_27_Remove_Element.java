package Java.Array;
public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {

        int len = nums.length;
        
        int newlen = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
                newlen++;
            }
        }
        newlen = len - newlen;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                if (index != i) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }

        return newlen;
    }

    public static void main(String[] args) {
        int[] arr = { 2 };

        System.out.println(removeElement(arr, 3));
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
