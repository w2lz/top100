public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, current = 0;
        for (int num : nums) {
            current = current <= 0 ? num : (current + num);
            max = Math.max(max, current);
        }
        return max;
    }
}
