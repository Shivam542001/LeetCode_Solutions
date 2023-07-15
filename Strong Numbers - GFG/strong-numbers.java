//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isStrong(int N) {
        int dn = N, sum = 0;
        while(dn>0){
            int rem = dn%10;
            sum=sum+factorial(rem);
            dn=dn/10;
        }
        return sum==N?1:0;
    }
    
    static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
};