class Solution {
    public int countSegments(String s) {
        int count=0;
        String[] arr = s.split(" ");
        for(String el: arr){
            if(el.equals("")==false)
                count++;
        }
        return count;
    }
}