public class Rotate {
    public void rotateByCopy(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return;
        int n = nums.length, m = k % n, i = 0;
        int[] t = new int[n];
        for (int j = n-m; j < n; j ++) t[i++] = nums[j];
        for (int j = 0; j < n-m; j ++) t[i++] = nums[j];
        for (int j = 0; j < n; j ++) nums[j] = t[j];
    }

    private void reverse(int[] nums, int i, int j) {
        for (; i < j; i ++, j --) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

    public void rotateBySwap(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return;
        int n = nums.length, m = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, m-1);
        reverse(nums, m, n-1);
    }
}
