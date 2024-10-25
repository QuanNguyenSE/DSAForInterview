package Java.Array;

import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int v = map.get(s.charAt(i));
                map.put(s.charAt(i), ++v);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int v = map.get(s.charAt(i));
                if (v == 1)
                    return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
