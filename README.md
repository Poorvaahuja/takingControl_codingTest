# takingControl_codingTest
CONTEST PROBLEMS
## Q1
Given an integer , find each  such that:
where  denotes the bitwise XOR operator. Return the number of 's satisfying the criteria.
Example
There are four values that meet the criteria:
Return .
Function Description
Complete the sumXor function in the editor below.
sumXor has the following parameter(s):
- int n: an integer
Returns
- int: the number of values found
Input Format
A single integer, .
Constraints
Subtasks for  of the maximum score.
Output Format
Sample Input 0
5
Sample Output 0
2
Explanation 0
For , the  values  and  satisfy the conditions:
Sample Input 1
10
Sample Output 1
4
## Q2
Palindromes are strings that read the same from the left or right, for example madam or 0110.
You will be given a string representation of a number and a maximum number of changes you can make. Alter the string, one digit at a time, to create the string representation of the largest number possible given the limit to the number of changes. The length of the string may not be altered, so you must consider 's left of all higher digits in your tests. For example  is valid,  is not.
Given a string representing the starting number, and a maximum number of changes allowed, create the largest palindromic string of digits possible or the string '-1' if it is not possible to create a palindrome under the contstraints.
Example
Make  replacements to get .
Make  replacement to get .
Function Description
Complete the highestValuePalindrome function in the editor below.
highestValuePalindrome has the following parameter(s):
string s: a string representation of an integer
int n: the length of the integer string
int k: the maximum number of changes allowed
Returns
string: a string representation of the highest value achievable or -1
Input Format
The first line contains two space-separated integers,  and , the number of digits in the number and the maximum number of changes allowed.
The second line contains an -digit string of numbers.
Constraints
Each character  in the number is an integer where .
Output Format
Sample Input 0
STDIN   Function
-----   --------
4 1     n = 4, k = 1
3943    s = '3943'
Sample Output 0
3993
Sample Input 1
6 3
092282
Sample Output 1
992299
Sample Input 2
4 1
0011
Sample Output 2
-1
## Q3
<img width="641" alt="image" src="https://github.com/Poorvaahuja/takingControl_codingTest/assets/122693422/c39b4bb7-182b-4e23-9ed5-10556fd12f30">
