import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String s = "pwwkew";
//        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
//        int[] nums = new int[]{2,7,11,15};
//        System.out.println(Arrays.toString(new TwoSum().twoSumForce(nums, 9)));
//        System.out.println(Arrays.toString(new TwoSum().twoSumHashMap(nums, 9)));
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(strings));
    }
}