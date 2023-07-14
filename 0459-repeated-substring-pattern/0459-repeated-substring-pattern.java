class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)==s.charAt(0)){
                int len = (s.replace(s.substring(0,i),"")).length();
                if(len==0)
                    return true;
            }
        }
        return false;
    }
}