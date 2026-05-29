class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length== 0 || k<= 0){
            return new int[0];
        }

        int ansLength= nums.length - k +1;
        int [] ans= new int[ansLength];
        Deque<Integer> numQueue= new LinkedList<>();

        for(int i =0; i< nums.length; i++){
            if(!numQueue.isEmpty() && numQueue.peek()< i-k+1){
                numQueue.poll();
            }

            while(!numQueue.isEmpty() && nums[numQueue.peekLast()] < nums[i]){
                numQueue.pollLast();
            }

            numQueue.offer(i);

            if(i>= k-1){
                ans[i-k+1]= nums[numQueue.peek()];
            }
        }
        return ans;
        
    }
}
