class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueSet= new HashSet<>();
        
        for(int i: nums){
            if(uniqueSet.contains(i)){
                return true;
            }
            uniqueSet.add(i);
        }
        
        return false;
        
    }
}