class Solution {
    public boolean isAnagram(String s, String t) {
         int[] charCount= new int[26];

         for(char ch: s.toCharArray()){
            charCount[ch - 'a']++;
         }

         for(char ch: t.toCharArray()){
            charCount[ch - 'a']--;
         }

         for(int i : charCount){
            if(i!= 0){
                return false;
            }
         }

         return true;

    }
}
