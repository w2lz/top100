public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
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
}
