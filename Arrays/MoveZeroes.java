//Leetcode 283: Move Zeroes
//Approach: Two pointer
//TC:O(n)
//SC:O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=left+1;
        while(right<nums.length){
            while(right<nums.length && nums[left]==0 && nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;
            }
            while(right<nums.length && nums[left]==0 && nums[right]==0){
                right++;
            }
            while(right<nums.length && nums[left]!=0 && nums[right]!=0){
                right++;
                left++;
            }
             while(right<nums.length && nums[left]!=0 && nums[right]==0){
                right++;
                left++;
            }
            
        }
    }
}
