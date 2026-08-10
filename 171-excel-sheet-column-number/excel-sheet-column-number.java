class Solution {
    public int titleToNumber(String columnTitle) {
        int result =0;
        for( char c : columnTitle.toCharArray()){
            int charvalue = c - 'A'+1;
            result=result*26+charvalue;
        }
        return result;
    }
}