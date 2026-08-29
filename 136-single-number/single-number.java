class Solution {
    public int singleNumber(int[] nums) {
        int []hashh= new int [60001];
        for(int i =0;i<nums.length;i++){
            hashh[nums[i]+30000]++;
        } 
        for(int i =0;i<hashh.length;i++){
            if(hashh[nums[i] + 30000] == 1){
                return nums[i];
            }
        }
        return 0;
    }
}