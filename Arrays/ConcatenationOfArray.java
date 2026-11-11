//problem:concatenation of array
//Approach:Create a new array and copy the elements twice
//Time complexity:O(n)
//space Complexity:O(n)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int size=2*n;
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            if(i<n){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[i-n];
            }
        }
        return ans;

        
    }
}
