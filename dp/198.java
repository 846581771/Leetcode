class Solution {
    public int rob(int[] nums) {
        int len = nums.length; 
        if(len == 1) return nums[0]; 
        int first = nums[0]; 
        int second = Math.max(first, nums[1]);
        for(int i = 2; i < nums.length; i++)
        {
            int temp = second; 
            second = Math.max(first + nums[i], second);
            first = temp; 
        }
        return second; 
    }
}
