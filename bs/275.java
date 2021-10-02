class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length; 
        //if(len == 1) return citations[0];
        int l = 0; 
        int r = len - 1; 
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            int v = citations[mid]; 
            if(len - mid == v && v >= mid)
            {
                return v; 
            }
            if(len - mid > v)
            {
                l = mid + 1; 
            }
            else
            {
                r = mid - 1; 
            }
        }
        return len - (r + 1);
    }
}
