import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            Character c = sToT.get(sChar);

            if (c == null) {
                if (tToS.containsKey(tChar)) return false;

                sToT.put(sChar, tChar);
                tToS.put(tChar, sChar);
            } else if (c != tChar) return false;

        }
        return true;
    }
}