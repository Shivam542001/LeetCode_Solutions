//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isLeap(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isLeap(int n){
        if((n%4==0&&n%100!=0)||n%400==0)
            return 1;
        return 0;
    }
}