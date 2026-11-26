//Leetcode11:Container with most water
//Approach : Two pointer
//TC:O(n)
//SC:O(1)
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int larArea=0;
        while(left<right){
            int l=right-left;
            int b=Math.min(height[left],height[right]);
            int area=l*b;
            if(area>larArea){
                larArea=area;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return larArea;
    }
}
