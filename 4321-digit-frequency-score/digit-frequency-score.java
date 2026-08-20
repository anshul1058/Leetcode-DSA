class Solution {
    public int digitFrequencyScore(int n) {
        int []hashh= new int [10];
        while(n>0){
            int digit=n%10;
             n = n/10;
             hashh[digit]++;
        }
        int sum=0;
        for( int i =0;i<10;i++){
            if(hashh[i]!=0){
                sum=sum+(i*hashh[i]);
            }
        }
        return sum;
    }
}