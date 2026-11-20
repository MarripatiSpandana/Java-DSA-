//Leetcode: 345
//Approach: Two Pointer
//TC:O(n)
//SC:O(n)
class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        String vowels="aeiouAEIOU";
        char[] arr=s.toCharArray();
        while(left<right){
            while(left<right && !vowels.contains(String.valueOf(arr[right]))){
                right--;
            }
            while(left<right && !vowels.contains(String.valueOf(arr[left]))){
                left++;
            }
            if(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;

            }
            
        }
        return new String(arr);

    }
}
