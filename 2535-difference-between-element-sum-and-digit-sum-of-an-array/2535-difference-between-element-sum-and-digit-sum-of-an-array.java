class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digsum=0;

        for(int i=0;i<nums.length;i++){
            elesum +=nums[i];
            digsum += dig(nums[i]);
        }
        return elesum>digsum?elesum-digsum:digsum-elesum;
    }

    int dig(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}