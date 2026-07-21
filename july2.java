
import java.util.ArrayList;

public class july2 {
    public static void main(String[] args) {
        int[]arr={1,2,1};
    //     Stack<Integer>s=new Stack<>();
        ArrayList<Integer>al=new ArrayList<>();
    //     for (int i = arr.length-1; i>=0; i--) {
    //         while (!s.isEmpty()&&s.peek()<=arr[i]) { 
    //             s.pop();
    //         }
    //         if(s.isEmpty()){
    //             al.add(-1);
    //         }
    //         else{
    //             al.add(s.peek());
    //         }
    //         s.push(arr[i]);
    //     }
    // System.out.println(al);


for(int i=0;i<arr.length;i++){
  int ans=-1;
    for(int j=1;j<arr.length;j++){
        int index=(i+j)%arr.length;
        if(arr[index]>arr[i]){
           ans=arr[index];
            break;
        }
    }
    al.add(ans);
}

System.out.println(al);
    }
}
