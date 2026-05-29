class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return Character.toString((char)258);
        }

        StringBuilder sb= new StringBuilder();
        for(String str: strs){
            sb.append(str);
            sb.append(Character.toString((char)257));
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)258))){
            return new ArrayList<>();
        }

        return Arrays.asList(str.split(Character.toString((char) 257), -1));
    }
}
