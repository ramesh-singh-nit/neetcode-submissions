class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int longestSeq = 1;
        Set<Integer> numSet= new HashSet<>();

        for(int i : nums){
            numSet.add(i);
        }

        for(int i: numSet){
            int currentSeq= 1;
            if(numSet.contains(i-1)){
                continue;
            }
            int currentNum = i;
            while(numSet.contains(currentNum+1)){
                currentNum++;
                currentSeq++;
            }
            longestSeq= Math.max(currentSeq, longestSeq);
        }


        return longestSeq;
        
    }
}
