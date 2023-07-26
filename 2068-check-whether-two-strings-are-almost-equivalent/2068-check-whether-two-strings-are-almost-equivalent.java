class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i=0;i<word1.length();i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            hm1.put(ch1, (hm1.getOrDefault(ch1,0)+1));
            hm2.put(ch2, (hm2.getOrDefault(ch2,0)+1));
        }

        for(int i=0;i<word1.length();i++){
            char ch = word1.charAt(i);
            int wf1 = hm1.getOrDefault(ch,0);
            int wf2 = hm2.getOrDefault(ch,0);  
            int res =wf1-wf2;
            if(res>3 || res<-3)
                return false;
        }
        for(int i=0;i<word2.length();i++){
            char ch = word2.charAt(i);
            int wf1 = hm1.getOrDefault(ch,0);
            int wf2 = hm2.getOrDefault(ch,0);
            int res =wf2-wf1;
            if(res>3 || res<-3)
                return false;
        }
        return true;
    }
}