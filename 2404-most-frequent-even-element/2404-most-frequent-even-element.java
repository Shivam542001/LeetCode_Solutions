class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        int maxTime = 0;
        int maxEl = -1;
        
        for(Map.Entry<Integer,Integer> ent : hm.entrySet() ){
            if(ent.getValue()>maxTime){
                maxEl = ent.getKey();
                maxTime = ent.getValue();
            }
            if(ent.getValue()==maxTime){
                maxEl = maxEl < ent.getKey() ? maxEl : ent.getKey();
            }
        }
        return maxEl;
    }
}