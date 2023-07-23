class Solution {
    public int countVowelSubstrings(String word) {
        HashMap<Character, Integer>hm = new HashMap<>();
        int res = 0;        
        for(int i=0;i<word.length();i++){
            zeroMap(hm);
            for(int j=i;j<word.length();j++){
                char ch = word.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    hm.put(ch, (hm.get(ch)+1));
                    if(isOk(hm))
                        res++;
                }
                else
                    break;
            }
        }
        return res;
    }
    boolean isOk(HashMap<Character, Integer> hm){
        if(hm.get('a')>0 && hm.get('e')>0 && hm.get('i')>0 && hm.get('o')>0 && hm.get('u')>0)
            return true;
        return false;
    }
    void zeroMap(HashMap<Character, Integer> hm){
        hm.put('a',0);
        hm.put('e',0);
        hm.put('i',0);
        hm.put('o',0);
        hm.put('u',0);
    }
}