//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int dn = n;
        int f = cube(dn%10);
        dn/=10;
        int s = cube(dn%10);
        dn/=10;
        int t = cube(dn%10);
        dn/=10;
        return f+s+t==n?"Yes":"No";
    }
    static int cube(int i){
        return i*i*i;
    }
}