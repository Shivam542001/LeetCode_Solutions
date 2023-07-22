class Solution {
    public boolean isPowerOfThree(int n) {
        long pv = 1;
        int three = 3;    
        
        if(n<0)
            three = -3;


        while(pv>=Integer.MIN_VALUE && pv<=Integer.MAX_VALUE){
            if(pv==n)
                return true;
            if(pv>n)
                return false;
            pv*=three;
        }
        return false;
    }
}