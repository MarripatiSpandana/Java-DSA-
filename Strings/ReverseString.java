//Leetcode 344: Reverse String
//Approach:Two pointer
//Time complexity: O(n)
//Space complexity:O(1)
class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

    }
}
