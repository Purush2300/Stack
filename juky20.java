

import java.util.ArrayList;
import java.util.Collections;

public class juky20 {
 public static void main(String[] args) {
   int[]arr={153, 10, 9474, 371, 25, 407};
  ArrayList<Integer>list= new ArrayList<>();
   int s=0;
   for(Integer n:arr){
      if(amstrong(n)){
            list.add(n);
      }
   }
   Collections.sort(list, Collections.reverseOrder());
   for(Integer k:list){
    System.out.println(k);
   }
 }   

    private static int count(int amg) {
      int cnt=0;
        while (amg>0) { 
           cnt++;
           amg=amg/10;
       }
       return cnt;
    }

    private static boolean  amstrong(int amg) {
                int total=0;
                 int orginal=amg;
                int n=count(amg);
                int k=n;
            
            while(n>0){

                    int last=amg%10;
                
                    int w=1;
                
                    for(int i=1;i<=k;i++){
                    w*=last;
                    
                    }
                
                    total+=w;
                
                    w=1;
                    
                    amg=amg/10;
                    n--;
            }
            return orginal==total;

    }
}
