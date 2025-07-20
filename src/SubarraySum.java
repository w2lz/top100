import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public int subarraySumBruteForce(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; i ++) {
            int sum = 0;
            for (int j = i; j < n; j ++) {
                sum += nums[j];
                if (sum == k) cnt++;
            }
        }
        return cnt;
    }

    public int subarraySumPrefixSum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, cnt = 0;
        for (int num : nums) {
            sum += num;
            cnt += map.getOrDefault(sum-k, 0);
            int sumCnt = map.getOrDefault(sum, 0);
            map.put(sum, sumCnt + 1);
        }
        return cnt;
    }
}
