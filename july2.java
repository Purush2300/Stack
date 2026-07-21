
import java.util.ArrayList;
import java.util.Stack;

public class july2 {
    public static void main(String[] args) {
        int[]arr={1,3,2,4};
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = arr.length-1; i>=0; i--) {
            while (!s.isEmpty()&&s.peek()<=arr[i]) { 
                s.pop();
            }
            if(s.isEmpty()){
                al.add(-1);
            }
            else{
                al.add(s.peek());
            }
            s.push(arr[i]);
        }
    System.out.println(al);
    }
}
