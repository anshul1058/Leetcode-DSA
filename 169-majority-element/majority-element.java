class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashh = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hashh.put(nums[i], hashh.getOrDefault(nums[i], 0) + 1);
        }
        int freq=0;
        int greater=0;
        for (Map.Entry<Integer, Integer> entry : hashh.entrySet()) {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                greater = entry.getKey();
            }
        }
        return greater;
    }
}