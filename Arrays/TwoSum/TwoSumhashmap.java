//problem:Two sum
//Approach:Hashmap
//TC:O(n)
//SC:O(n)
import java.util.HashMap.*;
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int needed=target-nums[i];
        if(map.containsKey(needed)){
            int x=map.get(needed);
            int y=i;
            return new int[]{x,y};
        }
        else{
            map.put(nums[i],i);
        }
       
       }
       return new int[]{};
       
        
    }
}
