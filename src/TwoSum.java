import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSumForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int needNumbers = target - nums[i];
            if (map.containsKey(needNumbers)) {
                return new int[]{map.get(needNumbers), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
