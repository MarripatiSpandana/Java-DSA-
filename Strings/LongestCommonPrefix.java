//Leetcode:14- Longest Common Prefix
//Approach: Shortest String and prefix comparision 
//TC:O(n*m)
//SC:O(m)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String smallest=strs[0];
        for(int i=0;i<n;i++){
            if(smallest.length()>(strs[i].length())){
                smallest=strs[i];

            }

        }
        int N=smallest.length();
        for(String str:strs){
            while(N>0 && !smallest.substring(0,N).equals(str.substring(0,N))){
                N--;
            }
            smallest=str.substring(0,N);
           
        }
        return smallest;
    }
}
