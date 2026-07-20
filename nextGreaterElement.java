
import java.util.ArrayList;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[]arr={1,3,2,4};
        greater(arr);
    }

    private static void greater(int[] arr) {
       ArrayList<Integer>list=new ArrayList<>();



       for(int i=0;i<arr.length;i++){
        boolean found=false;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>arr[i]){
               
                list.add(arr[j]);
                found=true;
               
                break;
                
            }
        
        }
        if(!found){
            list.add(-1);
        }
       }
       System.out.println(list);
    }
}
