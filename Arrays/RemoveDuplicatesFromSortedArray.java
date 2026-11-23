//Leetcode:26 Remove duplicates from sorted array
//Approach: Fast and slow two pointer 
//TC:O(n)
//SC:O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int s=0;
        for(int i=1;i<nums.length;i++){
            if(nums[s]!=nums[i]){
                s++;
                int temp=nums[s];
                nums[s]=nums[i];
                nums[i]=temp;

            }

        }
        return s+1;
    }
}
