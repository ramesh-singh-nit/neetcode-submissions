class Solution {
    public String encode(List<String> strs) {

        StringBuilder tempString = new StringBuilder();

        for (String str : strs) {
            tempString.append(str.length()).append("#").append(str);
        }

        return tempString.toString();
    }

    public List<String> decode(String str) {
        List<String> res= new ArrayList<>();
        StringBuilder numLen = new StringBuilder();

        int i=0;
        while (i<str.length()) {
            int j=i;
            while(str.charAt(j)!= '#'){
                j++;
            }
            int strLen= Integer.parseInt(str.substring(i,j));
            i= j+1;
            
            j=i+strLen;
            res.add(str.substring(i,j));
            i=j;
        }

        return res;
    }
}
