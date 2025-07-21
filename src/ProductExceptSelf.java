public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] output = new int[n];

        leftProduct[0] = nums[0]; rightProduct[n-1] = nums[n-1];
        for (int i = 1; i < n; i ++)
            leftProduct[i] = leftProduct[i-1]*nums[i];
        for (int j = n-2; j >= 0; j --)
            rightProduct[j] = rightProduct[j+1]*nums[j];

        output[0] = rightProduct[1]; output[n-1] = leftProduct[n-2];
        for (int i = 1; i < n-1; i ++)
            output[i] = leftProduct[i-1] + rightProduct[i+1];
        return output;
    }
}
