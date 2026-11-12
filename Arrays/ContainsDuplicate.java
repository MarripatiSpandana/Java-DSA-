//problem: Leetcode 217-containsDuplicate
//Concept:Hashset
//TC:O(n)
//SC:O(n)
import java.util.HashSet;
class Solution{
  public boolean ContainsDuplicate(int[] nums){
    HashSet<Integer> set=new HashSet<>();
    for(int num:nums){
      if(!Set.add(num)){
        return true;
      }
    }
    return false;
  }
}
