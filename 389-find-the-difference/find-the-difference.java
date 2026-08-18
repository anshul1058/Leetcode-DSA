class Solution {
    public char findTheDifference(String s, String t) {
        int []hashh= new int [26];
        for(int i =0;i<s.length();i++){
            hashh[s.charAt(i)-'a']++;
            
        }
        for(int i =0;i<t.length();i++){
            hashh[t.charAt(i)-'a']--;
            
        }
        for(int i =0;i<26;i++){
            if(hashh[i]==-1){
                return (char) (i+'a');
            }
        }
    return 0;
    }
}