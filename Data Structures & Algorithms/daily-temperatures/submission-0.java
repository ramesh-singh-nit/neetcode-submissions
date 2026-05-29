class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempStack= new Stack<>();
        int [] ans = new int[temperatures.length];


        for(int i= 0; i<temperatures.length; i++){
            while(!tempStack.isEmpty() && temperatures[tempStack.peek()]< temperatures[i]){
                ans[tempStack.peek()]= i- tempStack.pop();
            }
            tempStack.push(i);
        }
        return ans;
    }
}
