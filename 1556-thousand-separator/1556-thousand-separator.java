class Solution {
    public String thousandSeparator(int n) {
        String str = n+"";
        StringBuilder res = new StringBuilder();

        for(int i=str.length()-1,j=1;i>=0;i--,j++){
            res.append(str.charAt(i));
            if(j==3 && i>0){
                res.append('.');
                j=0;
            }
        }
        return res.reverse().toString();
    }
}