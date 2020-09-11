import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception{
	   BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	   int t = Integer.parseInt(br.readLine());
	   while(t-->0){
	       int n = Integer.parseInt(br.readLine());
	       FindFectorial(n);
	       System.out.println();
	   }
	 }
	 
	 public static void FindFectorial(int n){
	     long[] dp =  new long[n+1];
	     dp[0] = 1;
	     dp[1] = 1;
	     for(int i =2; i<=n; i++){
	         dp[i] = dp[i-1]+dp[i-2];
	     }
	     for(int i =0; i<n; i++){
	         System.out.print(dp[i]+" ");
	     }
	 }
}