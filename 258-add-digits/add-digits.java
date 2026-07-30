class Solution {
    public int addDigits(int num) {
        // while(num>=10){
        //     int a=num/10;
        //     int b=num%10;
        //     num=a+b;

        // }
        // return num;
        // more optimeal
        // if(num==0){
        //     return 0;
        // }else if(num%9==0 && num>0){
        //     return 9;
        // }else{
        //     // not disvisoble by 9 then give remainder
        //     int n=num%9;
        //     return n;
        // }



        // exact omptimal
        if(num==0){
            return 0;
        }

        return 1 + (num-1)%9;

    }
}