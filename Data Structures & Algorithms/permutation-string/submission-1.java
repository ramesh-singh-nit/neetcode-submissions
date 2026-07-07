class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }

        int left= 0;
        int right= s1.length()-1;

        int [] freqMapS1= new int[26]; 
        int [] freqMapS2= new int[26];

        for(int i=0; i<s1.length(); i++){
            freqMapS1[s1.charAt(i)-'a']++;
            freqMapS2[s2.charAt(i)-'a']++;
        }

        while(right< s2.length()-1){
            if(matches(freqMapS1, freqMapS2)){
                return true;
            }
            freqMapS2[s2.charAt(left)- 'a']--;
            left++;
            right++;
            freqMapS2[s2.charAt(right)- 'a']++;
        }

        return matches(freqMapS1, freqMapS2);
    }


        private boolean matches(int[] s1, int[]s2){
            for(int i=0; i<s1.length; i++){
                if(s1[i]!= s2[i]){
                    return false;
                }
            }
            return true;
        }
        
    }

