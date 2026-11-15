//Leetcode:242- Valid anagra,
//Approach: Sorting
// TC:O(n log n)
//SC:O(1)
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1=s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=t.toCharArray();
        Arrays.sort(arr2);
        s=Arrays.toString(arr1);
        t=Arrays.toString(arr2);

        if(s.equals(t)){
            return true;
        }
        return false;
        
        
    }
}
  
