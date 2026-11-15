// Leetcode 268 - Missing Number
// Approach: Mathematical Sum
//TimeComplexity:O(n)
//Space Complexity:O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int esum=(n*(n+1))/2;
        int sum=0;


        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            
        }
        int num=esum-sum;
        return num;
            
        
    }
}
