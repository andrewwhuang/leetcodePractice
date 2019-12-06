package JewelsAndStones;

import java.util.ArrayList;
/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        int i;
        ArrayList<String> jewels = new ArrayList<String>();
        int result = 0;

        for(i = 0; i < J.length(); i++) {
            String letter = Character.toString(J.charAt(i));
            jewels.add(letter);
        }
        for(i = 0; i < S.length(); i++) {
            String letter = Character.toString(S.charAt(i));
            if (jewels.contains(letter)) {
                result++;
            }
        }
        return result;
    }
}