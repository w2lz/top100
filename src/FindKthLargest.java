import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargest {
    public int findKthLargestMinHeap(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            if (queue.size() < k) {
                queue.add(num);
            } else if (num > queue.peek()) {
                queue.poll();
                queue.add(num);
            }
        }
        return queue.peek();
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    int partition(int[] nums, int low, int high) {
        int pivot = nums[low], i = low, j = high;
        while (i < j) {
            while (i < j && nums[j] < pivot) j --;
            if (i < j) swap(nums, i, j);
            while (i < j && nums[i] > pivot) i ++;
            if (i < j) swap(nums, i, j);
        }
        return i;
    }

    public int findKthLargestQuickSelect(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int p = partition(nums, low, high);
            if (p == k - 1) return nums[p];
            else if (p > k - 1) high = p - 1;
            else low = p + 1;
        }
        return -1;
    }
}
