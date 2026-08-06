class Solution {
    public int findClosest(int x, int y, int z) {
        
        int sum1;
        if(z>x){
                 sum1 =z-x;
        }else{
            sum1=x-z;
        }
        
        int sum2;
        if(z>y){
         sum2=z-y;
            }else{
                sum2=y-z;
            }
        if(sum1<sum2){
            return 1;
        }else if(sum2<sum1){
            return 2;
        }else{
            return 0;
        }
    }
}