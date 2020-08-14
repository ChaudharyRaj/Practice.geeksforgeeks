/*Given an array A of size N. The elements of the array consists of positive integers. You have to find the largest element with minimum frequency.

Input Format: First line of input contains number of testcases T. For each testcase there will be two lines. First line contains N, next line contains N elements separated by spaces.

Output Format: For each testcase, print the largest element with minimum frequency.

User Task:
Your task is to complete the provided function LargButMinFreq(A, n) which accepts array A and n. Hence you have to return the largest element with minimum frequency.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
1
5
2 2 5 50 1

Output:
50

Explanation :
Testcase 1: All elements are having frequency 1 except 2. 50 is the maximum element with minimum frequency.

Note: use HashMap to compute the element and its frequency.

** For More Input/Output Examples Use 'Expected Output' option ***/

//User function Template for Java

// Helper class to find largest number with minimum frequency
class Geeks
{
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n)
    {
       HashMap<Integer, Integer> hm  = new HashMap<>();
        for(int a : arr){
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }else{
                hm.put(a,1);
            }
        }
        int ans =0;
        int  f =9999; 
        for(Map.Entry<Integer, Integer> it : hm.entrySet()){
            if((Integer)it.getValue()<f && (Integer)it.getKey()>ans){
                ans = it.getKey();
            }
        }
        return ans;
    }
}