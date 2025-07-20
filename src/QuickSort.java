public class QuickSort {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j ++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i ++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private void lomutoSort(int[] arr, int low, int high) {
        if (low < high) {
            int k = lomutoPartition(arr, low, high);
            lomutoSort(arr, low, k - 1);
            lomutoSort(arr, k + 1, high);
        }
    }

    public void lomutoSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        lomutoSort(arr, 0, arr.length - 1);
    }

    private int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low) / 2];
        int i = low, j = high;
        while (true) {
            while (arr[i] < pivot) i ++;
            while (arr[j] > pivot) j --;
            if (i >= j) return j;
            swap(arr, i, j);
            i ++;
            j --;
        }
    }

    private void hoareSort(int[] arr, int low, int high) {
        if (low < high) {
            int k = hoarePartition(arr, low, high);
            hoareSort(arr, low, k);
            hoareSort(arr, k + 1, high);
        }
    }

    public void hoareSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        hoareSort(arr, 0, arr.length - 1);
    }
}
