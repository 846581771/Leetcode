class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0; 
        }
        if(nums.length == 1)
        {
            return nums[0]; 
        }
        int max = nums[0]; 
        for(int i: nums)
        {
            if(i >max)
            {
                max = i; 
            }
        }
        int [] all = new int [max + 1];
        for(int j : nums)
        {
            all[j]++; 
        }
        int [] dp = new int [max + 1];
        dp[1] = all[1]*1;
        dp[2] = Math.max(dp[1], 2*all[2]);
        for(int k = 2; k <= max; k++)
        {
            dp[k] = Math.max(dp[k - 1], dp[k-2] + k*all[k]);
        }
        return dp[max];
    }
}
