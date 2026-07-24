
import java.util.ArrayList;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[]arr={9,25,234,234,56,45};
        greater(arr);
    }

    private static void greater(int[] arr) {


        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();



        for(int i=arr.length-1;i>=0;i--){
           
           while(!st.empty()&&st.peek()<=arr[i]){
            st.pop();
           }
           if (st.isEmpty()) {
            list.add(-1);
           } else {
            list.add(st.peek());
            
           }
           st.push(arr[i]);
        }
     
        System.out.println(list);
    }
}
