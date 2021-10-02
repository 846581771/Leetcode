class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; 
        int n = matrix[0].length; 
        if(target > matrix[m - 1][n - 1] || target < matrix[0][0])
        {
            return false; 
        }
        int l = 0; 
        int r = m - 1; 
        int start = m - 1;
        while(target < matrix[start][0])
        {
            start--; 
        }
        int s2 = n - 1; 
        while(target < matrix[0][s2])
        {
            s2--; 
        }
        boolean temp = false; 
        for(int i = 0; i <= start; i++)
        {
            if(bs(matrix[i], s2, target))
            {
                temp = true; 
                break; 
            }
        }
        return temp; 
    }
    public boolean bs(int [] arr, int s2, int target)
    {
        int l = 0; 
        int r = s2; 
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            if(arr[mid] == target)
            {
                return true; 
            }
            if(arr[mid] > target)
            {
                r = mid - 1; 
            }
            else
            {
                l = mid + 1; 
            }
        }
        return false; 
    }
}
