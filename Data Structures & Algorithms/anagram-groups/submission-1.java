class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();

        for(String str: strs){
            int[] temp= new int[26];
            for (int i=0; i< str.length(); i++){
                char ch= str.charAt(i);
                temp[ch - 'a']++;
            }
            String key= Arrays.toString(temp);
            List<String> lst= mp.getOrDefault(key, new ArrayList<>());
            lst.add(str);
            mp.put(key, lst);
        }

        return new ArrayList<>(mp.values());
        
    }
}
