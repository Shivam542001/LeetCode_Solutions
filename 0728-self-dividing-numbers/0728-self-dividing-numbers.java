class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();

        for(int i=left;i<=right;i++){
            int n = i;
            while(n>0){
                int rem = n%10;
                if(rem==0 || i%rem!=0)
                    break;
                n/=10;                
            }
            if(n==0)
                li.add(i);
        }
        return li;
    }
}