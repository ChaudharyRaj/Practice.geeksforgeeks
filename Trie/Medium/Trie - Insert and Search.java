/*Trie is an efficient information retrieval data structure. Use this data structure to store Strings and search strings. Your task is to use the TRIE data structure and search the given string A. If found print 1 else 0.

Expected Time Complexity: O(N * WORD_LEN + A_LEN).
Expected Auxiliary Space: O(N * WORD_LEN).

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consists of three lines.
First line of each test case consist of a integer N, denoting the number of element in a Trie to be stored.
Second line of each test case consists of N space separated strings denoting the elements to be stored in the trie.
Third line of each test case consists of a String A to be searched in the stored elements.

Output:
Print the respective output in the respective line.

Constraints:
1<=T<=20
1<=N<=20

Example:
Input:
1
8
the a there answer any by bye their
the
Output:
1*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
    static class TrieNode{
		static final int ALPHABET_SIZE  = 26;
		TrieNode[] childrend = new TrieNode[ALPHABET_SIZE ];
		boolean isEnd;
		public TrieNode(){
			for(int i=0; i<childrend.length; i++) childrend[i] = null;
			isEnd = false;
		}
	}
	static TrieNode root = new TrieNode();
	static void insert(String key){
		int length = key.length();
		int index;
		TrieNode node = root;
		for(int i=0; i<length; ++i){
			index  = key.charAt(i)-'a';
			if(node.childrend[index] == null){ 	node.childrend[index] = new TrieNode(); }
			node  =  node.childrend[index];
		}
		node.isEnd = true;
	}
	static boolean search(String key){
		int lenght = key.length();
		int index;
		TrieNode node = root;
		for(int i =0; i<lenght; ++i){
			index = key.charAt(i)-'a';
			if(node.childrend[index] == null)return false;
			node  =  node.childrend[index];
		}
		return node.isEnd;
	}
	
	public static void main (String[] args) throws  IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(br.readLine());
	 
	  while(T-->0){
	        int n = Integer.parseInt(br.readLine());
		    String[] keyArry = br.readLine().trim().split(" ");
		    String key = br.readLine();
		    for(int i=0; i<keyArry.length;i++){
				insert(keyArry[i]);
		    }
		    System.out.println(search(key) ? 1: 0);
	    }
    }
}