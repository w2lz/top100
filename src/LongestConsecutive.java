import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutiveSort(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 0, p = 0;
        while (p < nums.length) {
            int len = 1;
            while (p < nums.length - 1) {
                if (nums[p +1] - nums[p] > 1) break;
                if (nums[p+1] - nums[p] == 1) ++ len;
                ++ p;
            }
            max = Math.max(max, len);
            ++ p;
        }
        return max;
    }

    public int longestConsecutiveSet(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int num : nums) set.add(num);

        for (int i = 0; i < nums.length && !set.isEmpty(); ++ i) {
            set.remove(nums[i]);
            int low = nums[i ], high = nums[i];
            while (set.contains(--low)) set.remove(low);
            while (set.contains(++high)) set.remove(high);
            max = Math.max(max,high - low - 1);
        }
        return max;
    }
}
