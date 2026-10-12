package Lecture12;

import java.util.*;

class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];

        for (char ch : tiles.toCharArray()) {
            freq[ch - 'A']++;
        }

        return backtrack(freq);
    }

    public int backtrack(int[] freq) {
        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;
                freq[i]--;

                count += backtrack(freq);

                freq[i]++;
            }
        }

        return count;
    }
}