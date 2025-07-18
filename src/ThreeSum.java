import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSumOn3(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i< nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                for (int k = j + 1; k < nums.length; k ++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> elem = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (set.contains(elem)) continue;
                        set.add(elem);
                        result.add(elem);
                    }
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSumOn2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = nums.length-1; k >= 2; k --) {
            if (nums[k] < 0) break;
            int target = -nums[k], i = 0, j = k -1;
            while (i < j) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (i < j && nums[i+1] == nums[i]) i ++;
                    while (i < j && nums[j-1] == nums[j]) j --;
                    i ++;
                    j --;
                } else if (nums[i] + nums[j] < target) {
                    i ++;
                } else {
                    j --;
                }
            }
            while (k >= 2 && nums[k-1] == nums[k]) k --;
        }
        return result;
    }
}
