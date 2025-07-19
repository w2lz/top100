import java.util.Arrays;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring2N(String s) {
        int[] counts = new int[256];
        int i = 0, j = 0, maxLen = 0;
        for (; i < s.length(); i ++) {
            for (; j < s.length(); j ++) {
                if (counts[s.charAt(j)] != 0) break;
                counts[s.charAt(j)]++;
            }
            maxLen = Math.max(maxLen, j - i);
            counts[s.charAt(i)]--;
        }
        return maxLen;
    }

    public int lengthOfLongestSubstring1N(String s) {
        int[] index = new int[256];
        Arrays.fill(index, -1);
        int maxLen = 0;
        for (int i = 0, j = 0; j < s.length(); j ++) {
            i = Math.max(index[s.charAt(j)] + 1, i);
            maxLen = Math.max(maxLen, j - i + 1);
            index[s.charAt(j)] = j;
        }
        return maxLen;
    }
}
