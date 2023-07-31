class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0, rsum=0, tsum=0;
        
        for(int el:nums)
            tsum+=el;
        
        for(int i=0;i<nums.length;i++){
            rsum = tsum-lsum-nums[i];
            if(lsum == rsum)
                return i;
            lsum = lsum + nums[i];
        }
        return -1;
    }
}