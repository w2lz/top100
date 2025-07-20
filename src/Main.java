import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        String s = "pwwkew";
//        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring2N(s));
//        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring1N(s));
//        int[] nums = new int[]{2,7,11,15};
//        System.out.println(Arrays.toString(new TwoSum().twoSumForce(nums, 9)));
//        System.out.println(Arrays.toString(new TwoSum().twoSumHashMap(nums, 9)));
//        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(new GroupAnagrams().groupAnagrams(strings));
//        int[] nums = new int[]{100,4,200,1,3,2};
//        System.out.println(new LongestConsecutive().longestConsecutiveSort(nums));
//        System.out.println(new LongestConsecutive().longestConsecutiveSet(nums));
//        int[] nums = new int[]{0,1,0,3,12};
//        new MoveZeroes().moveZeroesAssign(nums);
//        new MoveZeroes().moveZeroesSwap(nums);
//        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
//        System.out.println(new MaxArea().maxArea(nums));
//        int[] nums = new int[]{-1,0,1,2,-1,-4};
//        System.out.println(new ThreeSum().threeSumOn2(nums));
//        System.out.println(new ThreeSum().threeSumOn3(nums));
//        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
//        System.out.println(new Trap().waterCanBeTrap(height));
//        System.out.println(new Trap().waterCanBeTrapO1(height));
//        String s = "cbaebabacd";
//        String p = "abc";
//        System.out.println(new FindAnagrams().findAnagrams(s, p));
//        System.out.println(new FindAnagrams().findAnagramsOn(s, p));

//        int[] nums = new int[]{1,1,1};
//        System.out.println(new SubarraySum().subarraySumBruteForce(nums, 2));
//        System.out.println(new SubarraySum().subarraySumPrefixSum(nums, 2));

//        String s = "ADOBECODEBANC", t = "ABC";
//        System.out.println(new MaxSlidingWindow().minWindow(s, t));

//        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(new MaxSubArray().maxSubArray(nums));

        int[] nums = new int[]{3,2,1,5,6,4};
        System.out.println(new FindKthLargest().findKthLargestMinHeap(nums, 2));
        System.out.println(new FindKthLargest().findKthLargestQuickSelect(nums, 2));
    }
}