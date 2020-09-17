/*Given an integer N denoting the Length of a line segment. you need to cut the line segment in such a way that the cut length of a line segment each time is integer either x , y or z. and after performing all cutting operation the total number of cutted segments must be maximum. 


Input
First line of input contains of an integer 'T' denoting number of test cases. First line of each testcase contains N . Second line of each testcase contains 3 space separated integers x , y and z.

Output
For each test case print in a new line an integer corresponding to the answer .


Constraints
1<=t<=70
1<=N,x,y,z<=4000
 

Example

Input

2
4
2 1 1
5
5 3 2


Output
4
2

In first test case, total length is 4, and cut lengths are 2, 1 and 1.  We can make maximum 4 segments each of length 1. In secon test case, we can make two segments of lengths 3 and 2.*/

//Solution...............

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0){
	        
	        int n = Integer.parseInt(br.readLine().trim());
	        String[] s = br.readLine().trim().split("\\s");
	        int arr[] = new int[3];
	        for(int i =0; i<arr.length; i++)
	            arr[i] = Integer.parseInt(s[i]);
	        int x = arr[0];
	        int y = arr[1];
	        int z = arr[2];
	        
	        int[] dp =  new int[n+1];
	        Arrays.fill(dp,-1);
	        System.out.println(solve(x,y,z,n,dp));
	    }
	 }
	 
	 public static int solve(int x, int y, int z, int n, int[] dp){
	        if(n == 0) return 0;
	        if(n < x && n < y && n < z) return -4000;
	        
	        if(dp[n] != -1) return dp[n];
	        
	         int opt1 = 1 + solve(x,y,z,n-x,dp);
	         int opt2 = 1 + solve(x,y,z,n-y,dp);
	         int opt3 = 1 + solve(x,y,z,n-z,dp);
	         return dp[n] = Math.max(opt1, Math.max(opt2, opt3));
	    }
}