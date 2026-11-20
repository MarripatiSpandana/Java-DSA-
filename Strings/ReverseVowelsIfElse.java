//Leetcode 345: Reverse Vowels
//Approach: Two pointer 
//TC:O(n)
//SC:O(1)
class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        String vowels="aeiouAEIOU";
        char[] arr=s.toCharArray();
        while(left<right){
            if(!vowels.contains(String.valueOf(arr[right]))){
                right--;
            }
            else if(!vowels.contains(String.valueOf(arr[left]))){
                left++;
            }
            
            else{
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
