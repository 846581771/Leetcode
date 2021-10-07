class Solution {
    public int jump(int[] nums) {
        int len = nums.length; 
        int end = 0; 
        int max = 0; 
        int step = 0; 
        for(int i = 0; i < len - 1; i++)
        {
            max = Math.max(max, i + nums[i]);
            if(end == i)
            {
                end = max; 
                step++; 
            }
        }
        return step; 
    }
}
