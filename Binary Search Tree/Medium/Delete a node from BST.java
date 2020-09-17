/*Given a Binary Search Tree (BST) and a node value. Delete the node with the given value from the BST. If no node with value x exists, then do not make any change. 

Input:
The first line of input contains the number of test cases T. For each test case, there will two lines. First line of input is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denote node values, and a character “N” denotes NULL child.

For example:
 
For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Second-line is an integer represents X

Output:
For each test case in a new line, print the inorder traversal of the modified BST.

Your Task:
You don't need to read input or print anything. Your task is to complete the function deleteNode() which takes two arguments. The first being the root of the tree, and an integer 'X' denoting the node value to be deleted from the BST. Return the root of the BST after deleting the node with value X. Do not make any update if there's no node with value X present in the BST. 

Expected Time Complexity: O(Height of the BST).
Expected Auxiliary Space: O(Height of the BST).

Constraints:
1 <= T <= 10
1 <= N <= 100000

Example:
Input:
2
2 1 3 N N N N
12
1 N 2 N 8 5 11 4 7 9 12
9
Output:
1 2 3
1 2 4 5 7 8 11 12

Explanation:
Testcase 1: In the given input there is no node with value 12 , so the tree will remain same.
Testcase 2: In the given input tree after deleting 9 will be*/

class Tree
{
    // Return the root of the modified BST after deleting the node with value X
    static Node findMin(Node root){
        
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
	public static Node deleteNode(Node root, int X)
	{
		if(root ==null) return root;
		else if(X < root.data)  root.left = deleteNode(root.left,X);
		else if(X > root.data)  root.right = deleteNode(root.right,X);
		else{
		    //if No any childe
		    if(root.left == null && root.right == null){
		        root = null;
		    }
		    // if One childe
		    else if(root.left == null){
		        Node temp =  root;
		        root = root.right;
		        temp =null;
		    }
		    // if One childe
		    else if(root.right == null){
		        Node temp = root;
		        root = root.left;
		        temp =  null;
		    }else{
		        //if 2 children
		        Node temp = findMin(root.right);
		        root.data = temp.data;
		        root.right = deleteNode(root.right,temp.data);
		    }
		}
		return root;
	}
}	