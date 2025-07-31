/*
Given an unsorted array arr. Find the count of elements less than or equal to the given element x.

Examples:

Input: x = 9, arr = [10, 1, 2, 8, 4, 5] 
Output: 5
Explanation: The 5 elements are 1, 2, 8, 4 and 5.
  */

class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int n = arr.size();
        int count = 0;
        // for(int i = 0; i<n ;i++){
        //     if(arr.get(i) <= x){ //Using arr.get(i) instead to access the element at index i in the List<Integer>
        //         count++;
        //     }
        // }
        
        //we can also use for-each loop
        for(int num :arr){
            if(num <= x){
                count++;
            }
        }
        
        return count;
    }
}
