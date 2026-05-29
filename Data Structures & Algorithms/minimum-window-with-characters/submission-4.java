class Solution {
    public String minWindow(String s, String t) {

        if(s.length()== 0 || t.length()== 0 || s.length() < t.length()){
            return "";
        }

        int left= 0;
        int right= 0;
        int [] ans = {-1, 0, 0};
        

        Map<Character, Integer> tMap= new HashMap<>();
        Map<Character, Integer> subStringMap= new HashMap<>();

    for (char ch: t.toCharArray()){
        tMap.put(ch, tMap.getOrDefault(ch,0)+1);
    }
    int required= tMap.size();
    int found= 0;

    while(right < s.length()){
        char ch= s.charAt(right);
        subStringMap.put(ch, subStringMap.getOrDefault(ch, 0)+1);
        if(tMap.containsKey(ch) && tMap.get(ch) == subStringMap.get(ch)){
            found++;
        }

        while(left <= right && required == found){
            ch= s.charAt(left);
            if(ans[0]== -1 || ans[0]>= right-left+1){
                ans[0]= right-left+1;
                ans[1]= left;
                ans[2]= right;
            }
            subStringMap.put(ch, subStringMap.get(ch)-1);
            if(tMap.containsKey(ch) && tMap.get(ch)> subStringMap.get(ch)){
                found--;
            }
            left++;
        }
        right++;

    }
    
    if(ans[0] == -1){
        return "";
    }

    return s.substring(ans[1], ans[2]+1);
        
    }
}
