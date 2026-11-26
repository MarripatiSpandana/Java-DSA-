//Leetcode 167: Two sum II-Input sorted array
//Approach:Two pointer(opposite)
//TC:O(n)
//SC:O(1)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }
            if(sum>target){
                right--;

            }
            else{
                left++;
            }

        }
        return new int[]{};
        
    }
}
