class Solution {
    public int findLucky(int[] arr) {
        int []hashh= new  int [502];
        for(int i =0;i<arr.length;i++){
            hashh[arr[i]]++;
        }
        for(int i =500;i>=1;i--){
            if(hashh[i]==i){
                return i;
            }
        }
        return -1;
    }
}