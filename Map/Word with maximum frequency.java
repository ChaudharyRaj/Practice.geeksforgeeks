/*You are given a string that is made up of words separated by spaces. Your task is to find the word with highest frequency, i.e. it appears maximum times in the sentence. If multiple words have maximum frequency, then print the word that occurs first in the sentence.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each testcase contains a string.

Output:
Print the word with the maximum frequency and the frequency, both separated by a space. See example for more clarity.

Constraints:
1<=T<=100
1<=Total Words<=100

Example:

Input:
5
the devil in the sky
amazon is amazon geeks for geeks is geeks for geeks
this is not right
excels
the phenomenal one

Output:
the 2
geeks 4
this 1
excels 1
the 1

Explanation:
For testcase 1: The frequency of the is 2, so we print the and its frequency
For testcase 3: Every word has the frequency of 1, so we print this 1 as this occurs first in the sentence*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException{
	    
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int t = Integer.parseInt(br.readLine());
	   while(t-->0){
	       String[] words = br.readLine().trim().split(" ");
	       HashMap<String, Integer> hm = new HashMap<>();
	       int max = 0;
	       for(String s: words){
	           if(hm.containsKey(s)){
	               hm.put(s,hm.get(s)+1);
	           }else{
	               hm.put(s,1);
	           }
	           if(hm.get(s) > max){
	               max = hm.get(s);
	           }
	       }
	       
	       for(String s: words){
	           if(hm.get(s) == max){
	               System.out.println(s+" "+ hm.get(s));
	               break;
	           }
	       }
	       
	   }
	 }
}