//Leetcode 27: Remove element
//Approach: Fast slow Two pointer
//TC:O(n)
//SC:O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp=nums[s];
                nums[s]=nums[i];
                nums[i]=temp;
                s++;
            }
        }
        return s;
        
    }
}
