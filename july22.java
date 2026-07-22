import java.util.ArrayList;
import java.util.Stack;

public class july22 {
    public static void main(String[] args) {
        int[]arr={4,8,5,2,25};
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty()&&s.peek()>=arr[i]) { 
                s.pop();
            }
            if(s.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(s.peek());
            }
            s.push(arr[i]);
        }
        System.out.println(list);
    }
}
