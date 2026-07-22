
import java.util.ArrayList;
import java.util.Stack;

public class temperature {
    public static void main(String[] args) {
        int[]arr={73,74,75,71,69,72,76,73};
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int ans=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                  
                    ans=j-i;
                    break;
                }
            }
            list.add(ans);
        }
System.out.println(list);
    }
}
