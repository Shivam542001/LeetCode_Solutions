//{ Driver Code Starts
import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this function*/
class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        long rnum = (num1*den2)+(num2*den1);
        long dnum = den1*den2;
        long min = rnum<dnum?rnum:dnum;
        min = (long)java.lang.Math.sqrt(min);
        
        while(min>1){
            if(rnum%min==0 && dnum%min==0){
                rnum/=min;
                dnum/=min;
            }
            min--;
        }
        System.out.println(rnum+"/"+dnum);
    }
}