class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Max-heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(map.get(b), map.get(a))
        );

        // Add distinct numbers to the heap
        for (int num : map.keySet()) {
            pq.offer(num);
        }

        // Extract top k frequent numbers
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}