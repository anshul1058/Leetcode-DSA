class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        int n=nums.length;
        
        // for(int i=0;i<n;i++){
        //     if(i!=nums[i]){
        //         return i;
        //     }
        // }
        // return n;
        int expected_sum=n*(n+1)/2;
        int actual_sum=0;
        for(int num :nums ){
            actual_sum+=num;
        }
        return expected_sum-actual_sum;
    }
    
}