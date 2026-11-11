import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            map.put(stones.charAt(i),
                map.getOrDefault(stones.charAt(i), 0) + 1);
        }

        int count = 0;

        for (char ch : set) {
            if (map.containsKey(ch)) {
                count += map.get(ch);
            }
        }

        return count;
    }
}