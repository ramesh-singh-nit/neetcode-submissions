class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap= new HashMap<>();

        charMap.put(')', '(');
        charMap.put('}', '{');
        charMap.put(']', '[');
        Stack<Character> charStack= new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '{' || ch== '[' || ch== '('){
                charStack.push(ch);
            }

            if(charMap.containsKey(ch)){
                if(!charStack.isEmpty() && charStack.peek()== 
                charMap.get(ch)){
                    charStack.pop();
                }else{
                    return false;
                }
                
            }
        }
        return charStack.isEmpty();
    }
}
