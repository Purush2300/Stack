
import java.util.HashSet;

public class july21 {
    public static void main(String[] args) {
        int[]arr={100,4,200,1,3,2};
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
       for(int n:set){
       if(set.contains(n)){
        
       }
       }
      
    }
}



/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

Input: nums = [1,0,1,2]
Output: 3

*/