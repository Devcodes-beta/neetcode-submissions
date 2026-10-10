class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets indexed by frequency
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        // Step 3: Collect the k most frequent numbers
        int[] result = new int[k];
        int index = 0;

        for (int freq = nums.length; freq >= 1 && index < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}