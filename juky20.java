public class juky20 {
 public static void main(String[] args) {
//    int[]arr{}
   
//    amstrong(amg);
 }   

    private static int count(int amg) {
      int cnt=0;
        while (amg>0) { 
           cnt++;
           amg=amg/10;
       }
       return cnt;
    }

    private static void amstrong(int amg) {
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
            System.out.println(orginal==total);

    }
}
