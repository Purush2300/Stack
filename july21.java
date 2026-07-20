
import java.util.HashMap;

public class july21 {
    public static void main(String[] args) {
        int[]arr={100,4,200,1,3,2};
        HashMap<Integer,Boolean> map1=new HashMap<>();
        HashMap<Integer,Boolean> map2=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map1.put(arr[i],true);
        }
        
        int Longestlength=0;
        
        for(int i=0;i<arr.length;i++){


            if (!map2.containsKey(arr[i])) {
                int val=arr[i];
                int cnt=0;
                while (map1.containsKey(val)) {
                map2.put(val, true);   
                cnt++;
                val++;
                }
            Longestlength=Math.max(Longestlength, cnt);
            }
       

    } 
  System.out.println(Longestlength);
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