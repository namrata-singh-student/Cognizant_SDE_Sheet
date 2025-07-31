/*
Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

Examples:

Input: arr[] = [111, 222, 333, 444, 555]
Output: true
Explanation:
arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.
*/
//Approach 1

/*Complete the Function below*/
class Solution {
    public static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n != 0 ){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(original != rev){
            return false;
        }else{
            return true;
        }
    }
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int n = arr.length;
        
        for(int i = 0; i<n ;i++){
            if(!isPalindrome(arr[i])){
                return false;
            }
        }
        return true;
    }
}

//Approach 2----------------------------------->>>>>>>>
class Solution{
    static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean isPalinArray(int[] arr) {
      
        // Traversing each element of the array
        // and check if it is palindrome or not
        for (int i = 0; i < arr.length; i++) {
            if (! isPalindrome(arr[i]))
                return false;
        }
        return true;
    }
}
