public class Trap {
    public int waterCanBeTrap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length,leftMax = -1, rightMax = -1, water = 0;
        int[] d = new int[n];
        for (int i = 0; i < n; i ++) {
            leftMax = Math.max(leftMax, height[i]);
            d[i] = leftMax;
        }
        for (int i = n - 1; i >= 0; i --) {
            rightMax = Math.max(rightMax, height[i]);
            d[i] = Math.min(d[i], rightMax);
            water += (d[i] - height[i]);
        }
        return water;
    }

    public int waterCanBeTrapO1(int[] height) {
        if (height == null || height.length == 0) return 0;
        int leftMax = -1, rightMax = -1, water = 0;
        int i = 0, j = height.length - 1;
        while (i <= j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            if (leftMax < rightMax) water += leftMax - height[i++];
            else water += rightMax - height[j--];
        }
        return water;
    }
}
