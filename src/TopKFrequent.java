import java.util.*;

public class TopKFrequent {
    public List<Integer> topKFrequentMinHeap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
        }

        Queue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) pq.poll();
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : pq) result.add(entry.getKey());
        return result;
    }
}
