class Solution {
    public int minMaxGame(int[] nums) {
        
        int n = nums.length;
        while(n!=1){
            boolean min = true;
            int index = 0;

            for(int i=0;i<n;i+=2){
                if(min==true){
                    nums[index] = nums[i]<nums[i+1]?nums[i]:nums[i+1];
                    index++;
                    min = false;
                }
                else{
                    nums[index] = nums[i]>nums[i+1]?nums[i]:nums[i+1];
                    index++;
                    min = true;
                }
            }
            n/=2;
        }
        return nums[0];
    }
}