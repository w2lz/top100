import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroesAssign(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        for (int i = slow; i < nums.length; i ++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroesSwap(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
