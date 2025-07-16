import java.util.*;

public class GroupAnagrams {

    private String getKey(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    private String getKey2(String s) {
        char[] c = new char[26];
        for (int i = 0; i < s.length(); i ++) {
            c[s.charAt(i) - 'a'] ++;
        }
        return new String(c);
    }

    private String getKey3(String s) {
        char[] c = new char[26];
        for (int i = 0; i < s.length(); i ++) {
            c[s.charAt(i) - 'a'] ++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i ++) {
            if (c[i] != 0) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strings) {
        if (strings == null || strings.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
//            String key = getKey(s);
//            String key = getKey2(s);
            String key = getKey3(s);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
