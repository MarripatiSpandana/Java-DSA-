// Approach: Hashmap
//TC:O(n)
//SC:O(k)
import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map=new HashMap<>();
        char[] ch1=s.toCharArray();
        for(char c:ch1){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))||map.get(t.charAt(i))==0){
               
               return false;
                
                
            }
            map.put(t.charAt(i), map.get(t.charAt(i))-1);
            
        }
        return true;
        
        
    }
}
