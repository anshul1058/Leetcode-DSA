class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        int num=0;
        while(n!=0){
            int temp = n%10;
             n = n/10;
            num =num *10 +temp;
        }
        if(num==x){
            return true;
        }else{
            return false;
        }
    }
}