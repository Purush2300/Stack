public class nextGreater {
    public static void main(String[] args) {
        int[]num1={2,4};
        int[]num2={1,2,3,4};
        int[]res=next(num1,num2);
        for(int i=0;i<res.length;i++){
System.out.println(res[i]+" ");
        }
    }

    private static int[] next(int[] num1, int[] num2) {
        int[]r=new int[num1.length];
        
        for(int i=0;i<num1.length;i++){
            r[i]=-1;
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    for(int k=j+1;k<num2.length;k++){
                        if(num2[k]>num1[i]){
                            r[i]=num2[k];
                            break;
                        }
                    }
                     break;
                }
               
            }
        }

        return r;
    }
}
