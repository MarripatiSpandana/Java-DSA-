//Leetcode 1480:Running sum of 1d Array
//approach:Prefix Sum
//Time complexity:O(n)
//Space Complexity:O(n)
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] runningSum=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            runningSum[i]=sum;
        }
        return runningSum;
        
    }
}
