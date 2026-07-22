import java.util.ArrayList;
import java.util.Stack;

public class july22 {
    public static void main(String[] args) {
        int[]arr={4,8,5,2,25};
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int ans=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    ans=arr[j];
                    break;
                }
            }
            list.add(ans);
        }
        System.out.println(list);
    }
}
