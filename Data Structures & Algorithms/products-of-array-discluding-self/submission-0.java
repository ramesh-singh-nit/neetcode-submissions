class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int post=1;

        int [] res= new int[nums.length];
        int [] preArr= new int[nums.length];
        int [] postArr= new int[nums.length];

        for(int i=0; i<nums.length; i++){
            preArr[i]= pre;
            pre*= nums[i];
        }

        for(int i=nums.length-1; i>=0; i--){
            postArr[i]= post;
            post*= nums[i];
        }

        for(int i= 0; i< nums.length; i++){
            res[i]= preArr[i]*postArr[i];
        }

        return res;
        
    }
}  
