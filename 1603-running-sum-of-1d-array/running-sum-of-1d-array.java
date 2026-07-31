class Solution {
    public int[] runningSum(int[] nums) {
        int sum;
        int[] run = new int[nums.length];
        for (int i =0;i<nums.length;i++){
            sum=0;
            for(int j=0; j<=i;j++){
                sum=sum+nums[j];
            }
            run[i]=sum;

        }
        return run;
    }
}