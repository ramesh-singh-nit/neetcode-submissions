class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap= new HashMap<>();

        for(String str: strs){
            int[] charArr= new int[26];
            for(char ch: str.toCharArray()){
                charArr[ch - 'a']++;
            }
            String mapKey= Arrays.toString(charArr);
            anagramMap.putIfAbsent(mapKey, new ArrayList<>());
            anagramMap.get(mapKey).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
