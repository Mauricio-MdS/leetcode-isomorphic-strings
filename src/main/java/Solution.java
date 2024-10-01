import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = characterMap.get(s.charAt(i));

            if (c == null) {
                if (characterMap.containsValue(t.charAt(i))) return false;

                characterMap.put(s.charAt(i), t.charAt(i));
            } else if (c != t.charAt(i)) return false;
        }
        return true;
    }
}