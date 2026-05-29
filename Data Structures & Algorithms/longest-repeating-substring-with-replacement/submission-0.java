class Solution {
    public int characterReplacement(String s, int k) {
        int left= 0;
        int right= 0;
        int maxOccurence= 0;
        int ans= 0;
        int[] charArr = new int[26];

        while(right < s.length()){
            charArr[(s.charAt(right) - 'A')]++;
            maxOccurence= Math.max(maxOccurence, charArr[(s.charAt(right) - 'A')]);

            if(right - left + 1 - maxOccurence > k){
                charArr[(s.charAt(left) - 'A')]--;
                left++;
            }
            ans= Math.max(ans, right - left + 1);
            right++;

        }
        
        return ans;
    }
}
