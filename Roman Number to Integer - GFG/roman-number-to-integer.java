//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends

class Solution {
    public int romanToDecimal(String str) {
        int sum = 0, curr=0, prev=0;
        
        for(int i=str.length()-1; i>=0 ; i--){
            curr= giveCounter( str.charAt(i) );
            if(prev>curr)
                sum = sum-curr;
            else
                sum = sum+curr;
            prev = curr;
        }
        return sum;
    }
    
    int giveCounter(char c){
        if(c=='I')
            return 1;
        else if(c=='V')
            return 5;
        else if(c=='X')
            return 10;
        else if(c=='L')
            return 50;
        else if(c=='C')
            return 100;
        else if(c=='D')
            return 500;
        else if(c=='M')
            return 1000;
        else 
            return 0;
    }
}