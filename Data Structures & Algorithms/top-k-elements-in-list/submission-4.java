class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        pq.addAll(map.entrySet());
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            Map.Entry<Integer, Integer> entry = pq.poll();
            result[i] = entry.getKey();
        }
        return result;
    }
}
