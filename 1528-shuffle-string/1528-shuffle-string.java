class Solution {
    public String restoreString(String s, int[] indices) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<indices.length; i++){
            for(int j=0;j<indices.length; j++){
                if(indices[j]==i)
                    sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
}