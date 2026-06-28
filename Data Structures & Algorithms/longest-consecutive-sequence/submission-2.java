class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> seqSet = new HashSet<>();

        for (int num : nums) {
            seqSet.add(num);
        }

        int index = 0;
        int res = 1;

        while (index < nums.length) {
            int seqLen = 1;
            if (!seqSet.contains(nums[index] - 1)) {
                int numCheck = nums[index] + 1;

                while (seqSet.contains(numCheck)) {
                    seqLen++;
                    numCheck += 1;
                }
            }
            res = Math.max(res, seqLen);
            index++;
        }
        return res;
    }
}
