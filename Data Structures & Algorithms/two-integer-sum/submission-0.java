class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ansMap= new HashMap<>();
        int[] result= new int[2];

        for(int i=0; i< nums.length; i++){
            if(ansMap.containsKey(target - nums[i])){
                result[1]= i;
                result[0]= ansMap.get(target-nums[i]);
            }else{
                ansMap.put(nums[i], i);
            }
        }

        return result;
    }
}
