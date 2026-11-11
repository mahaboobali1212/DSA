import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        LinkedHashMap<Character, Character> map1 = new LinkedHashMap<>();
        LinkedHashMap<Character, Character> map2 = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map1.containsKey(a)) {
                if (map1.get(a) != b) {
                    return false;
                }
            } else {
                map1.put(a, b);
            }

            if (map2.containsKey(b)) {
                if (map2.get(b) != a) {
                    return false;
                }
            } else {
                map2.put(b, a);
            }
        }

        return true;
    }
}