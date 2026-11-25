//Leetcode 80: Remove duplicates from sorted array II
//Approach:Fast and slow two pointer
//TC:O(n)
//SC:O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=2;
        for(int fast=2;fast<nums.length;fast++){
            if(nums[fast]!=nums[slow-2]){
                nums[slow]=nums[fast];
                slow++;
            }
        }
            
        return slow;
    }
}
