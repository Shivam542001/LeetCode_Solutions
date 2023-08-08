class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                idx++;
                swap(nums,idx,i);
            }
        }
        return nums;
    }

    void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}