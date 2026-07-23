import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class july23 {
    public static void main(String[] args) {
        int[]arr={73,74,75,71,69,72,73};
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();


        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                list.add(0);
            }
            else{
                list.add(s.peek()-i);

            }
            s.push(i);
        }
        Collections.reverseOrder();
        System.out.println(list);
    }
}
