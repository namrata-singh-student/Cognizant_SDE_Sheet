/*
Given an unsorted array arr[] of integers and a key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ) return an array of length 2 with elements start index and end index.(0 based indexing is used)

If the key does not exist in the array then return -1 for both start and end index in this case.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 5] , key = 5
Output:  [4, 5]
Explanation: 5 appears first time at index 4 and appears last time at index 5(0 based indexing)
*/

// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int n = arr.length;
        int leftIndex = -1;
        for(int i = 0 ; i<n ;i++){
            if(arr[i] == key){
                leftIndex = i;
                break;
            }
        }
        
        int rightIndex = -1;
        for(int i = n-1 ; i>=0 ;i--){
            if(arr[i] == key){
                rightIndex = i;
                break;
            }
        }
        
        return new int[]{leftIndex, rightIndex};
    }
}

//Note: In java we need to return an array like this:  return new int[]{leftIndex, rightIndex};
