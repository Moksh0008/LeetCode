class Solution {
    public int[] runningSum(int[] nums) {
        int[] PrefixSum = new int[nums.length];
        PrefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
                PrefixSum[i]=PrefixSum[i-1]+nums[i];
        }
        return PrefixSum;
    }
}