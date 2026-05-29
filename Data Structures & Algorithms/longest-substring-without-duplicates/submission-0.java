class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length= 0;
        int left = 0;
        int right= 0;
        Set<Character> charSet= new HashSet<>();

        while(right < s.length()){
            char ch= s.charAt(right);

            while(charSet.contains(ch)){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(ch);
            length= Math.max(length, right-left+1);
            right++;
        }
        return length;
    }
}
